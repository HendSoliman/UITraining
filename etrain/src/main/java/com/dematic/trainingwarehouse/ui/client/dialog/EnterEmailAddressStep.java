package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.wms.app.base.ui.client.dialog.steps.AbstractStep;
import com.dematic.wms.app.base.ui.client.dialog.steps.Step;
import com.dematic.wms.app.base.ui.client.dialog.steps.common.ContinueEvent;
import com.dematic.wms.app.base.ui.client.dialog.steps.common.StepEvent;
import com.dematic.wms.app.base.ui.shared.dto.DtoContext;

public class EnterEmailAddressStep extends AbstractStep<EmailAddressView, DtoContext> {

   private Step<?, DtoContext> nextStep;

   @Override
   public String getInstructionKey() {
      return "enterEmailAddress";
   }

   @Override
   protected void processEvent(StepEvent event) {

      if (event instanceof ContinueEvent) {

         getView().fillContextFromView(getDtoContext());
         replyEventResult(nextStep);
      }
   }

   public void setNextStep(Step<?, DtoContext> nextStep) {
      this.nextStep = nextStep;
   }

   @Override
   protected DtoContext createEmptyDtoContext() {
      return new DtoContext();
   }
}