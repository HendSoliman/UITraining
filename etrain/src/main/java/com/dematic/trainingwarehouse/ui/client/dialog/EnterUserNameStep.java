package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto;
import com.dematic.wms.app.base.ui.client.dialog.steps.AbstractStep;
import com.dematic.wms.app.base.ui.client.dialog.steps.Step;
import com.dematic.wms.app.base.ui.client.dialog.steps.common.ContinueEvent;
import com.dematic.wms.app.base.ui.client.dialog.steps.common.StepEvent;
import com.dematic.wms.app.base.ui.shared.dto.DtoContext;

public class EnterUserNameStep extends AbstractStep<UserNameView, DtoContext> {
   
  private Step<?, DtoContext> nextStep;
   
  @Override
  public String getInstructionKey() {
     return "enterUserName";
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