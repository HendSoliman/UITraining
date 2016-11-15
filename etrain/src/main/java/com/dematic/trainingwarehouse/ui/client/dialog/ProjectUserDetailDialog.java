package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.wms.app.base.ui.client.common.OverrideDefaultImplementation;
import com.dematic.wms.app.base.ui.client.scomponent.SDetailDialogPanel;
import com.dematic.wms.app.user.ui.client.dialog.UserDetailDialog;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;


@OverrideDefaultImplementation
public class ProjectUserDetailDialog extends UserDetailDialog {

   private static ProjectUserDetailDialogUiBinder uiBinder = GWT.create(ProjectUserDetailDialogUiBinder.class);

   interface ProjectUserDetailDialogUiBinder extends UiBinder<SDetailDialogPanel, ProjectUserDetailDialog> {
   }

   @Override
   protected SDetailDialogPanel createDetailPanelWithUiBinder() {
      return uiBinder.createAndBindUi(this);
   }
}
