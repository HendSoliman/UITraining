/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.event;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.wms.app.DeploymentBuilder;
import com.dematic.wms.app.base.control.factory.EntityFactory;
import com.dematic.wms.app.base.util.UserTransactionAdapter;

/**
 * @author Markus Leichter
 *
 */
@RunWith(Arquillian.class)
public class DeleteETrainGroupEventConsumerIT {

   @Inject
   DeleteETrainGroupEventProducer producer;

   @Inject
   EntityFactory ef;

   @PersistenceContext
   EntityManager em;

   @Inject
   UserTransactionAdapter userTransactionAdapter;

   ETrainGroup eTrainGroup;

   @Deployment
   public static Archive<?> createDeployment() {
      return new DeploymentBuilder().createDeployment();
   }

   /**
    * @throws java.lang.Exception
    */
   @Before
   public void setUp() throws Exception {
      eTrainGroup = ef.createInstance(ETrainGroup.class);
      eTrainGroup.setGroupName("groupName");
      userTransactionAdapter.begin();

      em.persist(eTrainGroup);
      userTransactionAdapter.commit();
   }

   @Test
   public void testEvent() throws Exception {
      producer.raiseEvent(eTrainGroup);
      Thread.sleep(2_000l);
   }
}
