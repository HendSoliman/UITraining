/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

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
public class ETrainUserManagementServiceIT {

   @Inject
   ETrainUserManagementService eTrainUserManagementService;

   @Deployment
   public static Archive<?> createDeployment() {
      return new DeploymentBuilder().createDeployment();
   }

   @Test
   public void testWelcome() {
      String welcomeUser = eTrainUserManagementService.welcomeUser("userMarkus");
      assertEquals("userMarkus", welcomeUser);
   }
}
