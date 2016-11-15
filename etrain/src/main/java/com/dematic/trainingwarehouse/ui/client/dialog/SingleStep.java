package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.trainingwarehouse.ui.client.service.ETrainUserServiceFactory;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto;
import com.dematic.wms.app.base.ui.client.dialog.StepByStepDialogAsyncCallback;
import com.dematic.wms.app.base.ui.client.dialog.steps.AbstractStep;
import com.dematic.wms.app.base.ui.client.dialog.steps.StepView;
import com.dematic.wms.app.base.ui.client.dialog.steps.common.ContinueEvent;
import com.dematic.wms.app.base.ui.client.dialog.steps.common.StepEvent;
import com.dematic.wms.app.base.ui.shared.dto.DtoContext;

public class SingleStep extends AbstractStep<StepView, DtoContext> {

   @Override
   public String getInstructionKey() {
      return "createUserInSingleStep";
   }

   @Override
   public void prepare() {
      getDtoContext().add(ETrainUserDto.createInstance());
      super.prepare();
   }

   @Override
   protected void processEvent(StepEvent event) {

      if (event instanceof ContinueEvent) {

         getView().fillContextFromView(getDtoContext());
         ETrainUserServiceFactory.getService().createDto(getDtoContext().getDto(ETrainUserDto.class),
                  new StepByStepDialogAsyncCallback<ETrainUserDto>(getDialog()) {
                     @Override
                     public void onSuccess(ETrainUserDto result) {
                        replyEventResult(SingleStep.this);
                     }
                  });
      }
   }

   @Override
   protected DtoContext createEmptyDtoContext() {
      return new DtoContext();
   }
}