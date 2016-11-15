/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.event;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.wms.app.DeploymentBuilder;
import com.dematic.wms.app.base.control.factory.EntityFactory;

/**
 * @author Markus Leichter
 *
 */
@RunWith(Arquillian.class)
public class DeleteETrainGroupEventProducerIT {

   @Inject
   private DeleteETrainGroupEventProducer producer;

   @Inject
   private EntityFactory ef;

   @Deployment
   public static Archive<?> createDeployment() {
      return new DeploymentBuilder().createDeployment();
   }

   @Test
   public void testRaiseEvent() throws Exception {
      ETrainGroup eTrainGroup = ef.createInstance(ETrainGroup.class);
      producer.raiseEvent(eTrainGroup);

      Thread.sleep(2000l);

   }

}
