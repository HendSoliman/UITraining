/*

 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.

 */
package com.dematic.trainingwarehouse.entity;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;

import com.dematic.wms.app.JPATestEntityManagerProvider;
import com.dematic.wms.app.TestFactory;
import com.dematic.wms.app.TransactionalJPATestEntityManagerProvider;

public class ETrainVehicleJPATest {

   @Rule
   public JPATestEntityManagerProvider emProvider = new TransactionalJPATestEntityManagerProvider();

   @Test
   public void createAndFindByKey() throws Exception {

      ETrainVehicle vehicle = TestFactory.createInstance(ETrainVehicle.class);
      vehicle.setName("markus");
      emProvider.getEntityManager().persist(vehicle);

      ETrainVehicle vehicle2 = TestFactory.createInstance(ETrainVehicle.class);
      vehicle2.setName("leichter");
      emProvider.getEntityManager().persist(vehicle2);

      ETrainVehicle vehicle3 = TestFactory.createInstance(ETrainVehicle.class);
      vehicle3.setName("leichter");
      vehicle3.setNumber(1l);
      emProvider.getEntityManager().persist(vehicle3);

      emProvider.getEntityManager().flush();

      List<ETrainVehicle> resultList = emProvider.getEntityManager().createQuery("SELECT v FROM ETrainVehicle v",
               ETrainVehicle.class).getResultList();
      for (ETrainVehicle eTrainVehicle : resultList) {
         System.out.println(eTrainVehicle);
      }

   }
}
