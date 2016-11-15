/*
 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.dematic.wms.app.JPATestEntityManagerProvider;
import com.dematic.wms.app.TestFactory;
import com.dematic.wms.app.TransactionalJPATestEntityManagerProvider;
import com.dematic.wms.app.base.EntityProvider;

public class ETrainTerminalSimpleJPATest {

   private static final String TERMINAL2 = "Terminal2";

   @Rule
   public JPATestEntityManagerProvider emProvider = new TransactionalJPATestEntityManagerProvider();

   EntityProvider ep;

   @Before
   public void setup() {
      ETrainTerminalSimple terminal = TestFactory.createInstance(ETrainTerminalSimple.class);
      terminal.setName(TERMINAL2);
      terminal.setIpAddress("127.0.0.1");
      terminal.setType("BROWSER");

      emProvider.getEntityManager().persist(terminal);
      emProvider.getEntityManager().flush();

      ep = new EntityProvider();
      ep.setMockedEntityManager(emProvider.getEntityManager());
   }

   @Test
   public void testKeyLookup() throws Exception {

      ETrainTerminalSimple template = TestFactory.createInstance(ETrainTerminalSimple.class);
      template.setName(TERMINAL2);

      ETrainTerminalSimple result = ep.find(template);
      assertNotNull(result);
   }

   @Test
   public void testNamedQuery() throws Exception {

      TypedQuery<ETrainTerminalSimple> namedQuery = emProvider.getEntityManager().createNamedQuery(
               ETrainTerminalSimple.FIND_BY_NAME, ETrainTerminalSimple.class);

      List<ETrainTerminalSimple> resultList = namedQuery.getResultList();
      assertFalse(resultList.isEmpty());
   }

   @Test
   public void testDynamicQuery() throws Exception {

      TypedQuery<ETrainTerminalSimple> dynamicQuery = emProvider.getEntityManager().createQuery(
               "select e from ETrainTerminalSimple e where e.terminalName = :name",
               ETrainTerminalSimple.class);

      dynamicQuery.setParameter("name", TERMINAL2);
      List<ETrainTerminalSimple> resultList = dynamicQuery.getResultList();
      assertFalse(resultList.isEmpty());
   }

}
