package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.wms.app.base.ui.client.dialog.steps.StepView;
import com.dematic.wms.app.base.ui.client.scomponent.SAttributePanel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;

public class UserNameView extends StepView {
 
   interface MyUiBinder extends UiBinder<SAttributePanel,UserNameView> {
   }
 
   private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);
 
 
   public UserNameView() {
      initWidget(createDetailPanel());
   }
 
   @Override
   protected UiBinder<SAttributePanel,UserNameView> getUiBinder() {
      return uiBinder;
   }
}