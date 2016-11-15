package com.dematic.trainingwarehouse.ui.client.command;

import com.dematic.wms.app.base.ui.client.command.SCommand;
import com.dematic.wms.app.base.ui.client.common.OverrideDefaultImplementation;
import com.dematic.wms.app.user.ui.client.command.UserCommandFactory;


@OverrideDefaultImplementation
public class ProjectUserCommandFactory extends UserCommandFactory {

 

   @Override

   protected SCommand createCreateDtoCommand() {

      return new ProjectCreateUserCommand();

   }

}