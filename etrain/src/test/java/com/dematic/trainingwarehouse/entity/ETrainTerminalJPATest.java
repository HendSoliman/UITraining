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

public class ETrainTerminalJPATest {

   private static final String TERMINAL2 = "Terminal2";

   @Rule
   public JPATestEntityManagerProvider emProvider = new TransactionalJPATestEntityManagerProvider();

   @Test
   public void createAndFindByKey() throws Exception {

      ETrainTerminal terminal = TestFactory.createInstance(ETrainTerminal.class);
      terminal.setName(TERMINAL2);
      terminal.setIpAddress("127.0.0.1");
      terminal.setType(ETrainTerminalType.BROWSER);

      emProvider.getEntityManager().persist(terminal);
      emProvider.getEntityManager().flush();

      TypedQuery<ETrainTerminal> createQuery = emProvider.getEntityManager().createQuery(
               "select e from ETrainTerminal e where e.terminalName = :name",
               ETrainTerminal.class);

      createQuery.setParameter("name", TERMINAL2);
      List<ETrainTerminal> resultList = createQuery.getResultList();
      assertFalse(resultList.isEmpty());
      assertNotNull(emProvider.getEntityManager().find(ETrainTerminal.class, terminal.getPrimaryKey()));
   }
}
