/*

 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.

 */
package com.dematic.trainingwarehouse.entity;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.persistence.TypedQuery;

import org.junit.Rule;
import org.junit.Test;

import com.dematic.wms.app.JPATestEntityManagerProvider;
import com.dematic.wms.app.TestFactory;
import com.dematic.wms.app.TransactionalJPATestEntityManagerProvider;

public class ETrainUserJPATest {

   @Rule
   public JPATestEntityManagerProvider emProvider = new TransactionalJPATestEntityManagerProvider();

   @Test
   public void createAndFindByKey() throws Exception {
      ETrainUser user = TestFactory.createInstance(ETrainUser.class);
      user.setUserName("test");
      user.setFullName("Hans Wurst");
      emProvider.getEntityManager().persist(user);
      emProvider.getEntityManager().flush();

      TypedQuery<ETrainUser> createQuery = emProvider.getEntityManager().createQuery(
               "select e from ETrainUser e where e.userName = :username",
               ETrainUser.class);

      createQuery.setParameter("username", "test");
      List<ETrainUser> resultList = createQuery.getResultList();
      assertFalse(resultList.isEmpty());
      assertNotNull(emProvider.getEntityManager().find(ETrainUser.class, user.getPrimaryKey()));
   }
}
