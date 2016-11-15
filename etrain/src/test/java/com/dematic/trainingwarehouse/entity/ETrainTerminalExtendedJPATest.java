/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.dematic.wms.app.JPATestEntityManagerProvider;
import com.dematic.wms.app.TestFactory;
import com.dematic.wms.app.TransactionalJPATestEntityManagerProvider;

/**
 * @author Markus Leichter
 *
 */
public class ETrainTerminalExtendedJPATest {

   private static final String EXTENSION = "extensionABC";

   @Rule
   public JPATestEntityManagerProvider emProvider = new TransactionalJPATestEntityManagerProvider();

   @Before
   public void setup() {
      ETrainTerminal terminal1 = TestFactory.createInstance(ETrainTerminal.class);
      terminal1.setName("TERMINAL1");
      terminal1.setIpAddress("127.0.0.1");
      terminal1.setType(ETrainTerminalType.BROWSER);
      emProvider.getEntityManager().persist(terminal1);
      emProvider.getEntityManager().flush();

      ETrainTerminalExtended terminal2 = TestFactory.createInstance(ETrainTerminalExtended.class);
      terminal2.setName("TERMINAL2");
      terminal2.setIpAddress("127.0.0.2");
      terminal2.setType(ETrainTerminalTypeExtended.MOBILE);
      terminal2.setExtension(EXTENSION);
      emProvider.getEntityManager().persist(terminal2);

      emProvider.getEntityManager().flush();

   }

   @Test
   public void testNamedQuery() {
      TypedQuery<ETrainTerminalExtended> namedQuery = emProvider.getEntityManager().createNamedQuery(
               ETrainTerminalExtended.FIND_BY_EXTENSION,
               ETrainTerminalExtended.class);
      namedQuery.setParameter("extension", EXTENSION);

      List<ETrainTerminalExtended> resultList = namedQuery.getResultList();
      assertNotNull(resultList);
      assertEquals(1, resultList.size());
   }

}
