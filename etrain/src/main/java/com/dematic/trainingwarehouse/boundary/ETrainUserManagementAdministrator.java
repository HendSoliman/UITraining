/**
 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dematic.trainingwarehouse.control.event.DeleteETrainGroupEvent;
import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.trainingwarehouse.entity.ETrainPermission;
import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.wms.app.base.AbstractStateless;
import com.dematic.wms.app.event.boundary.EventProducer;

/**
 * @author Markus Leichter
 * 
 */
@Stateless
public class ETrainUserManagementAdministrator extends AbstractStateless {

   protected final Logger LOGGER = LoggerFactory.getLogger(ETrainUserManagementAdministrator.class);

   @Inject
   private ETrainUserProvider userProvider;

   @Inject
   private ETrainUserGroupProvider groupProvider;

   @Inject
   private ETrainPermissionProvider permissionProvider;

   @Inject
   private EventProducer eventProducer;

   public void deleteETrainGroup(String groupName) {
      ETrainGroup group = groupProvider.getETrainUserGroupByName(groupName);
      eventProducer.fireEvent(new DeleteETrainGroupEvent(groupName));
      em.remove(group);
   }

   public void deleteETrainPermission(String permissionName) {
      ETrainPermission permission = permissionProvider.getETrainPermissionByName(permissionName);
      em.remove(permission);
   }

   public void deleteETrainUser(String userName) {
      ETrainUser user = userProvider.getETrainUserByName(userName);
      em.remove(user);

   }

   public ETrainGroup saveETrainUserGroup(ETrainGroup group) {
      return em.merge(group);
   }

   public ETrainPermission saveETrainPermission(ETrainPermission permission) {
      return em.merge(permission);
   }

   public ETrainUser saveUser(ETrainUser user) {
      return em.merge(user);
   }

   public ETrainPermission createETrainPermission() {
      return ef.createInstance(ETrainPermission.class);
   }

   public ETrainUser createETrainUser() {
      return ef.createInstance(ETrainUser.class);
   }
}
