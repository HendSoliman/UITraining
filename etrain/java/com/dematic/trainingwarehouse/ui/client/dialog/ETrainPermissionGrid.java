/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.wms.app.base.ui.client.scomponent.datagrid.DtoAdministrationGrid;
import com.dematic.trainingwarehouse.ui.client.command.ETrainPermissionCommandFactory;

/**
 * administartion grid class for ETrainPermissionDto
 * @author Hend Soliman
 */

public class ETrainPermissionGrid extends DtoAdministrationGrid {

   public ETrainPermissionGrid() {
      super(ETrainPermissionCommandFactory.getInstance());
   }
}
