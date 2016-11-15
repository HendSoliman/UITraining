/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.wms.app.base.ui.client.dialog.DtoDetailDialog;
import com.dematic.wms.app.base.ui.client.scomponent.SDetailDialogPanel;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;

/**
 * detail dialog for ETrainGroupDto
 * @author Hend Soliman
 */

public class ETrainGroupDetailDialog extends DtoDetailDialog<ETrainGroupDto> {

   private static ETrainGroupDetailDialogUiBinder uiBinder = GWT.create(ETrainGroupDetailDialogUiBinder.class);

   interface ETrainGroupDetailDialogUiBinder extends UiBinder<SDetailDialogPanel, ETrainGroupDetailDialog> {
   }

   @Override
   protected SDetailDialogPanel createDetailPanelWithUiBinder() {
      return uiBinder.createAndBindUi(this);
   }

}
