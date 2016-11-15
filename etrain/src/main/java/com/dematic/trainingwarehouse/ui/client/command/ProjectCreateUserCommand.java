package com.dematic.trainingwarehouse.ui.client.command;

import com.dematic.wms.app.base.ui.client.command.CreateDtoCommand;
import com.dematic.wms.app.user.ui.client.service.UserManagementServiceAsync;
import com.dematic.wms.app.user.ui.shared.UserDto;

public class ProjectCreateUserCommand extends CreateDtoCommand<UserDto, UserManagementServiceAsync> {

   @Override
   protected void showDetailDialog(UserDto dto) {
      dto.setLocked(true);
      super.showDetailDialog(dto);
   }

}