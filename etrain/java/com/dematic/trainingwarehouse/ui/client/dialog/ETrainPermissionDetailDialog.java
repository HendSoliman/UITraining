/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.wms.app.base.ui.client.dialog.DtoDetailDialog;
import com.dematic.wms.app.base.ui.client.scomponent.SDetailDialogPanel;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;

/**
 * detail dialog for ETrainPermissionDto
 * @author Hend Soliman
 */

public class ETrainPermissionDetailDialog extends DtoDetailDialog<ETrainPermissionDto> {

   private static ETrainPermissionDetailDialogUiBinder uiBinder = GWT.create(ETrainPermissionDetailDialogUiBinder.class);

   interface ETrainPermissionDetailDialogUiBinder extends UiBinder<SDetailDialogPanel, ETrainPermissionDetailDialog> { }

 

   @Override

   protected SDetailDialogPanel createDetailPanelWithUiBinder() {

      return uiBinder.createAndBindUi(this);

   }

}
