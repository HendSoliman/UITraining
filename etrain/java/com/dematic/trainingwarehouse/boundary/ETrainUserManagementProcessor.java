/**
 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 * 
 */
@Stateless
public class ETrainUserManagementProcessor extends AbstractStateless {

   @Inject
   ETrainUserProvider userProvider;

   /*
    * (non-Javadoc)
    * 
    * @see
    * com.dematic.director.app.user.service.UserManagementProcessor#resetCurrentUser
    * ()
    */
   public void resetUser(ETrainUser user) {
      if (user.isLoggedOn()) {
         ETrainUser mergedUser = em.merge(user);
         mergedUser.setLoggedOn(false);
      }

   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * com.dematic.director.app.user.service.UserManagementProcessor#loginUser
    * (com.dematic.director.app.user.model.User)
    */
   public ETrainUser loginUser(ETrainUser user) {
      ETrainUser result = user;
      if (!user.isLoggedOn()) {
         ETrainUser mergedUser = em.merge(user);
         mergedUser.setLoggedOn(true);
         mergedUser.setTimeOfLastLogin(new Date());
         result = mergedUser;
      }

      return result;
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * com.dematic.director.app.user.service.UserManagementProcessor#logoutUser
    * (com.dematic.director.app.user.model. User)
    */
   public ETrainUser logoutUser(ETrainUser user) {
      ETrainUser result = user;
      if (user != null && user.isLoggedOn()) {
         ETrainUser mergedUser = em.merge(user);
         mergedUser.setLoggedOn(false);
         mergedUser.setTimeOfLastLogout(new Date());
         result = mergedUser;
      }

      return result;
   }

}
