package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.trainingwarehouse.ui.client.service.ETrainUserServiceFactory;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto;
import com.dematic.wms.app.base.ui.client.dialog.MessageDialog;
import com.dematic.wms.app.base.ui.client.dialog.StepByStepDialogAsyncCallback;
import com.dematic.wms.app.base.ui.client.dialog.steps.AbstractStep;
import com.dematic.wms.app.base.ui.client.dialog.steps.Step;
import com.dematic.wms.app.base.ui.client.dialog.steps.common.ContinueEvent;
import com.dematic.wms.app.base.ui.client.dialog.steps.common.StepEvent;
import com.dematic.wms.app.base.ui.shared.dto.DtoContext;
import com.google.gwt.user.client.Command;

public class ValidateEmailAddressStep extends AbstractStep<EmailAddressView, DtoContext> {

   private Step<?, DtoContext> nextStep;

   private Step<?, DtoContext> errorStep;

   private String firstEnteredEmailAddress;

   @Override
   public String getInstructionKey() {
      return "reEnterEmailAddress";
   }

   @Override
   public void prepare() {

      ETrainUserDto userDto = getDtoContext().getDto(ETrainUserDto.class);
      firstEnteredEmailAddress = userDto.getEmailAddress();
      userDto.setEmailAddress(null);

      super.prepare();
   }

   @Override
   protected void processEvent(StepEvent event) {

      if (event instanceof ContinueEvent) {

         final ETrainUserDto userDto = getDtoContext().getDto(ETrainUserDto.class);
         getView().fillContextFromView(getDtoContext());

         if (firstEnteredEmailAddress.equals(userDto.getEmailAddress())) {
            ETrainUserServiceFactory.getService().createDto(userDto, new StepByStepDialogAsyncCallback<ETrainUserDto>(getDialog()) {
               @Override
               public void onSuccess(ETrainUserDto result) {
                  replyEventResult(nextStep);
               }

               @Override
               public void onFailure(Throwable caught) {
                  super.onFailure(caught);
                  replyEventResult(nextStep);
               }
            });
         } else {
            MessageDialog.showError(new RuntimeException("Validation Failed"), new Command() {
               @Override
               public void execute() {
                  userDto.setEmailAddress(null);
                  replyEventResult(errorStep);
               }
            });
         }
      }
   }

   public void setNextStep(Step<?, DtoContext> nextStep) {
      this.nextStep = nextStep;
   }

   public void setErrorStep(Step<?, DtoContext> errorStep) {
      this.errorStep = errorStep;
   }

   @Override
   protected DtoContext createEmptyDtoContext() {
      return new DtoContext();
   }
}
