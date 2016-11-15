/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto;
import com.dematic.wms.app.base.ui.client.dialog.AdministeredDto;
import com.dematic.wms.app.base.ui.client.scomponent.MainDialog;
import com.dematic.wms.app.base.ui.client.scomponent.SMainDialog;
import com.dematic.wms.app.base.ui.client.scomponent.datagrid.DtoAdministrationGrid;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;

/**
 * dialog to administer ETrainUserDto
 * @author Hend Soliman
 */

@MainDialog
public class ETrainUserOverviewDialog extends SMainDialog {

   private static UiBinder<Widget, ETrainUserOverviewDialog> uiBinder = GWT.create(ETrainUserOverviewDialogUiBinder.class);

   interface ETrainUserOverviewDialogUiBinder extends UiBinder<Widget, ETrainUserOverviewDialog> {
   }

   @UiField(provided = true)
   @AdministeredDto(dtoClass=ETrainUserDto.class) 
   public DtoAdministrationGrid grid;

   @Override
   protected Widget createUiBinderWidget() {
      return uiBinder.createAndBindUi(this);
   }

   @Override
   protected void initGrids() {
      grid = new ETrainUserGrid();
   }
}
