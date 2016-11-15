/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.dialog;

import com.dematic.trainingwarehouse.ui.client.command.ETrainGroupCommandFactory;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDtoMetaData;
import com.dematic.wms.app.base.ui.client.scomponent.basegrid.DataGrid;
import com.dematic.wms.app.base.ui.client.scomponent.basegrid.DefaultRowRenderer.RowStyle;
import com.dematic.wms.app.base.ui.client.scomponent.datagrid.DtoAdministrationGrid;
import com.dematic.wms.app.base.ui.client.scomponent.datagrid.WhereCondition;
import com.dematic.wms.app.base.ui.shared.scomponent.AttributeId;

/**
 * administartion grid class for ETrainGroupDto
 * @author Hend Soliman
 */

public class ETrainGroupGrid extends DtoAdministrationGrid {

   public ETrainGroupGrid() {
      super(ETrainGroupCommandFactory.getInstance());
   }

   @Override
   public void init() {
      super.init();
      addAction(getCommandFactory().createDtoCommand(ETrainGroupCommandFactory.ASSOCIATE_USER_TO_GROUP));
      RenderCondition renderCondition = new RenderCondition() {

         @Override
         public boolean complies(DataGrid grid, int rowIndex) {

            return new Integer(0).equals(grid.getValueAt(rowIndex,

                     new AttributeId(ETrainGroupDto.createInstance().getMetaData(),

                              ETrainGroupDtoMetaData.PERMISSION_COUNT)));

         }

      };

      WhereCondition filterCondition = new WhereCondition().equal("permission_count", 0);

      addRenderCondition(RowStyle.WARNING, renderCondition, filterCondition);

   }

   //   @Override 
   //   public void init() {
   //     super.init();
   //     addAction(getCommandFactory().createDtoCommand(ETrainGroupCommandFactory.ASSOCIATE_USER_TO_GROUP));
   //   }
}
