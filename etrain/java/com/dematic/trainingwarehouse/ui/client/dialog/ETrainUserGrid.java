/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.wms.app.base.ui.client.scomponent.datagrid.DtoAdministrationGrid;
import com.dematic.trainingwarehouse.ui.client.command.ETrainUserCommandFactory;

/**
 * administartion grid class for ETrainUserDto
 * @author Hend Soliman
 */

public class ETrainUserGrid extends DtoAdministrationGrid {

   public ETrainUserGrid() {
      super(ETrainUserCommandFactory.getInstance());
   }
}
