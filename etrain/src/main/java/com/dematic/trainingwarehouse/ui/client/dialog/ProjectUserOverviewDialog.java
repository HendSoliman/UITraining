package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.wms.app.base.ui.client.common.OverrideDefaultImplementation;
import com.dematic.wms.app.user.ui.client.dialog.UserOverviewDialog;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;

@OverrideDefaultImplementation
public class ProjectUserOverviewDialog extends UserOverviewDialog {

   private static ProjectUserOverviewDialogUiBinder uiBinder = GWT.create(ProjectUserOverviewDialogUiBinder.class);

   interface ProjectUserOverviewDialogUiBinder extends UiBinder<Widget, ProjectUserOverviewDialog> {
   }

   @Override
   protected Widget createUiBinderWidget() {
      return uiBinder.createAndBindUi(this);
   }
}