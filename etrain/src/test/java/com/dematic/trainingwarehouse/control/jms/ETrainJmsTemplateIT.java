/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.jms;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.dematic.wms.app.DeploymentBuilder;

/**
 * @author Markus Leichter
 *
 */
@RunWith(Arquillian.class)
public class ETrainJmsTemplateIT {

   private static final String MESSAGE = "hello";

   @Inject
   ETrainJmsSender sender;

   @Inject
   ETrainJmsReceiver receiver;

   @Deployment
   public static Archive<?> createDeployment() {
      return new DeploymentBuilder().createDeployment();
   }

   @Test
   public void testSendReceive() throws Exception {
      sender.sendMessage(MESSAGE);
      Thread.sleep(500);
      String receive = receiver.receive();
      assertEquals(MESSAGE, receive);
   }

}
