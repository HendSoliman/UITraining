/**
 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import com.dematic.trainingwarehouse.entity.ETrainPermission;
import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.wms.app.base.AbstractStateless;
import com.dematic.wms.app.base.interceptor.WrapEntityManagerExceptions;

import javax.ejb.Stateless;
import java.util.List;

/**
 * @author Markus Leichter
 * 
 */
@Stateless
public class ETrainUserProvider extends AbstractStateless {

   /*
    * (non-Javadoc)
    * 
    * @see com.dematic.director.app.user.service.UserProvider#getAllUsers()
    */
   public List<ETrainUser> getAllETrainUsers() {
      return em.createNamedQuery(ETrainUser.FIND_ALL, ETrainUser.class).getResultList();
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * com.dematic.director.app.user.service.UserProvider#getUserByName(java.
    * lang.String)
    */
   @WrapEntityManagerExceptions
   public ETrainUser getETrainUserByName(String name) {
      return em.find(ETrainUser.class, name);
   }

   /**
    *
    * @param userName
    * @return
    */
   @WrapEntityManagerExceptions
   public ETrainUser getByName(String userName) {
      return em.createNamedQuery(ETrainUser.FIND_BY_NAME, ETrainUser.class).setParameter("username", userName).getSingleResult();
   }


   /**
    * 
    * @param name
    * @param permission
    * @return
    */
   public List<ETrainUser> getListByNameAndPermission(String name, ETrainPermission permission) {

      return em.createNamedQuery(ETrainUser.FIND_BY_NAME_AND_PERMISION, ETrainUser.class).setParameter("username", name)
               .setParameter("permissionname", permission.getPermissionName()).getResultList();

   }
}
