package com.dematic.trainingwarehouse.ui.server.service;

import javax.enterprise.inject.Specializes;

import com.dematic.wms.app.user.entity.User;
import com.dematic.wms.app.user.ui.server.service.UserManagementServiceImpl;

@Specializes
public class ProjectUserServiceImpl extends UserManagementServiceImpl {

   @Override
   public void deleteEntity(User entity) {

      User entityToDelete = ep.findByPrimaryKey(User.class, entity.getUserName());

      entityToDelete.setDescription("To be deleted");

      entityAdministrator.update(null, entityToDelete);

   }

}
