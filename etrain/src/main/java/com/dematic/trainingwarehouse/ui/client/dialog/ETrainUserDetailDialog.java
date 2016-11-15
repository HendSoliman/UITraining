/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.trainingwarehouse.ui.client.command.ETrainUserCommandFactory;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto;
import com.dematic.wms.app.base.ui.client.dialog.DtoDetailDialog;
import com.dematic.wms.app.base.ui.client.scomponent.SDetailDialogPanel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;

/**
 * detail dialog for ETrainUserDto
 * @author Hend Soliman
 */

public class ETrainUserDetailDialog extends DtoDetailDialog<ETrainUserDto> {

   private static ETrainUserDetailDialogUiBinder uiBinder = GWT.create(ETrainUserDetailDialogUiBinder.class);

   interface ETrainUserDetailDialogUiBinder extends UiBinder<SDetailDialogPanel, ETrainUserDetailDialog> {
   }

   @Override
   protected SDetailDialogPanel createDetailPanelWithUiBinder() {
      return uiBinder.createAndBindUi(this);
   }

   @Override
   protected String[] getExcludedAdditionalCommandIds() {

      return new String[]{ETrainUserCommandFactory.NAVIGATE_TO_USER};

   }
}
