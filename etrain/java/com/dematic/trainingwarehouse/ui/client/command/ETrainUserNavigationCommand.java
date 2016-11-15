package com.dematic.trainingwarehouse.ui.client.command;

import java.util.HashMap;

import com.dematic.trainingwarehouse.ui.client.service.ETrainUserServiceAsync;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDtoMetaData;
import com.dematic.wms.app.base.ui.client.command.SingleDtoCommand;
import com.dematic.wms.app.base.ui.client.frame.AppContext;
import com.dematic.wms.app.base.ui.client.scomponent.datagrid.column.AbstractColumnDescription.FilterDescription;
import com.dematic.wms.app.base.ui.shared.scomponent.AttributeId;

public class ETrainUserNavigationCommand extends SingleDtoCommand<ETrainUserDto, ETrainUserServiceAsync> {

   @Override
   public void execute() {

      HashMap<AttributeId, FilterDescription> filterValues = new HashMap<AttributeId, FilterDescription>();
      FilterDescription filterDesc = FilterDescription.createEqual(getDto().getUserName());
      filterValues.put(new AttributeId(ETrainUserDto.createInstance().getMetaData(),
               ETrainUserDtoMetaData.USER_NAME), filterDesc);

      AppContext.getInstance().openDialog(ETrainUserDto.createInstance(), this, filterValues);
   }
}