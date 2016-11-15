/**
 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import java.util.List;

import javax.ejb.Stateless;

import com.dematic.trainingwarehouse.entity.ETrainPermission;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 *
 */
@Stateless
public class ETrainPermissionProvider extends AbstractStateless {

   /*
    * (non-Javadoc)
    * 
    * @see
    * com.dematic.director.app.user.service.UserProvider#getAllPermissions()
    */
   public List<ETrainPermission> getAllETrainPermissions() {
      return em.createNamedQuery(ETrainPermission.FIND_ALL, ETrainPermission.class).getResultList();
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * com.dematic.director.app.user.service.UserProvider#getPermissionByName
    * (java.lang.String)
    */
   public ETrainPermission getETrainPermissionByName(String name) {
      return em.find(ETrainPermission.class, name);
   }
}
