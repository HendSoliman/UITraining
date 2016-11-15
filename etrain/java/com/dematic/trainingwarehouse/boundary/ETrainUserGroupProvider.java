/**
 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import java.util.List;

import javax.ejb.Stateless;

import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 *
 */
@Stateless
public class ETrainUserGroupProvider extends AbstractStateless {

   /*
    * (non-Javadoc)
    * 
    * @see com.dematic.director.app.user.service.UserProvider#getAllGroups()
    */
   public List<ETrainGroup> getAllETrainUserGroups() {
      return em.createNamedQuery(ETrainGroup.FIND_ALL, ETrainGroup.class).getResultList();
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * com.dematic.director.app.user.service.UserProvider#getGroupByName(java
    * .lang.String)
    */
   public ETrainGroup getETrainUserGroupByName(String name) {
      return em.find(ETrainGroup.class, name);
   }
}
