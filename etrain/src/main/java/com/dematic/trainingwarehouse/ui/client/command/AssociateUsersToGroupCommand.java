package com.dematic.trainingwarehouse.ui.client.command;

import com.dematic.trainingwarehouse.ui.client.dialog.AssociateUserToGroupDialog;
import com.dematic.trainingwarehouse.ui.client.service.ETrainGroupServiceAsync;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDtoMetaData;
import com.dematic.wms.app.base.ui.client.SCommandAsyncCallback;
import com.dematic.wms.app.base.ui.client.command.SingleDtoSubDialogCommand;
import com.dematic.wms.app.base.ui.client.scomponent.AbstractDetailDialog;
import com.dematic.wms.app.base.ui.client.scomponent.SWindowPanel;

public class AssociateUsersToGroupCommand extends SingleDtoSubDialogCommand<ETrainGroupDto, ETrainGroupServiceAsync> {

   @Override
   protected SWindowPanel createAndShowSubDialog(final ETrainGroupDto argDto) {
      //      setDto(argDto, false);   
      AssociateUserToGroupDialog result = new AssociateUserToGroupDialog();

      result.setName(argDto.getGroupName());
      result.setAssignedUsers(argDto.getUsers());
      result.showModal();

      result.setDialogListener(new DetailDialogListener(this) {

         @Override
         public void confirm(AbstractDetailDialog dialog) {

            getDto().setUsers(((AssociateUserToGroupDialog) dialog).getAssignedUsers());

            getDtoService().updateDto(getDto(), new SCommandAsyncCallback<Void>

                     (AssociateUsersToGroupCommand.this));

         }

      });
      return result;
   }

   @Override
   public void execute() {
      getDtoService().getDto(getDto().createEntityKey(),
               new String[]{ETrainGroupDtoMetaData.USERS},
               getIntermediateCallback());
   }
}
