/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.dematic.wms.app.DeploymentBuilder;
import com.dematic.wms.app.base.control.factory.EntityFactory;

/**
 * @author Markus Leichter
 *
 */
@RunWith(Arquillian.class)
public class ETrainTerminalExtendedIT {

   @Inject
   private EntityFactory ef;

   @Deployment
   public static Archive<?> createDeployment() {
      return new DeploymentBuilder().createDeployment();
   }

   @Test
   public void testInstanceOf() throws Exception {
      ETrainTerminal eTrainTerminal = ef.createInstance(ETrainTerminal.class);
      assertTrue(eTrainTerminal instanceof ETrainTerminalExtended);
   }
}
