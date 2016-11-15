package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.wms.app.base.ui.client.dialog.steps.Step;
import com.dematic.wms.app.base.ui.client.dialog.steps.StepByStepDialog;
import com.dematic.wms.app.base.ui.client.scomponent.MainDialog;
import com.google.gwt.core.client.GWT;

@MainDialog
public class CreateUserWizard extends StepByStepDialog {

   @Override
   protected Step<?, ?> createSteps() {
      setWidth(500 + "px");
      setHeight(500 + "px");
      EnterUserNameStep startStep = GWT.create(EnterUserNameStep.class);
      UserNameView view = GWT.create(UserNameView.class);
      startStep.setView(view);

      EnterEmailAddressStep emailAddressStep = GWT.create(EnterEmailAddressStep.class);
      EmailAddressView emailAddressView = GWT.create(EmailAddressView.class);
      emailAddressStep.setView(emailAddressView);

      ValidateEmailAddressStep validateStep = GWT.create(ValidateEmailAddressStep.class);
      validateStep.setView(emailAddressView);

      startStep.setNextStep(emailAddressStep);
      emailAddressStep.setNextStep(validateStep);
      validateStep.setNextStep(startStep);
      validateStep.setErrorStep(emailAddressStep);
      return startStep;
   }

}
