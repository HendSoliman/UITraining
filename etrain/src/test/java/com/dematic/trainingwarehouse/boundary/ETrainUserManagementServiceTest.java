/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dematic.trainingwarehouse.control.config.ETrainUserDimension;
import com.dematic.trainingwarehouse.control.config.ETrainUserTopic;
import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.wms.app.TestFactory;
import com.dematic.wms.app.base.control.factory.EntityFactory;
import com.dematic.wms.app.config.boundary.ConfigurationReader;
import com.dematic.wms.app.config.boundary.ConfigurationTopicProvider;

/**
 * @author Markus Leichter
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ETrainUserManagementServiceTest {

   /**
    * 
    */
   private static final String USERNAME = "userMarkus";

   private static final String MESSAGE = "welcomeYou";

   @Mock
   ETrainUserProvider eTrainUserProviderMock;

   @Mock
   EntityFactory entityFactoryMock;

   @Mock
   EntityManager entityManagerMock;

   @Mock
   ConfigurationReader configurationReaderMock;

   @Mock
   ConfigurationTopicProvider<ETrainUserDimension, ETrainUserTopic> configurationTopicProviderMock;

   @Mock
   ETrainUserTopic eTrainUserTopicMock;

   ETrainUserManagementService service;

   /**
    * @throws Exception
    */
   @Before
   public void init() throws Exception {

      ETrainUser eTrainUser = TestFactory.createInstance(ETrainUser.class);
      eTrainUser.setUserName(USERNAME);
      when(eTrainUserProviderMock.getETrainUserByName(USERNAME)).thenReturn(eTrainUser);

      when(entityFactoryMock.createInstance(eq(ETrainUser.class))).thenReturn(TestFactory.createInstance(ETrainUser.class));

      when(configurationTopicProviderMock.get(any(ETrainUserDimension.class))).thenReturn(eTrainUserTopicMock);
      when(configurationReaderMock.read(eq(ETrainUserTopic.class))).thenReturn(configurationTopicProviderMock);
      when(eTrainUserTopicMock.getWelcomeMessage()).thenReturn(MESSAGE);

      service = new ETrainUserManagementService();
      service.eTrainUserProvider = eTrainUserProviderMock;
      service.setMockedEntityFactory(entityFactoryMock);
      service.setMockedEntityManager(entityManagerMock);
      service.configurationReader = configurationReaderMock;
   }

   @Test
   public void testWelcomeUser() {
      String welcomeUser = service.welcomeUser(USERNAME);
      assertEquals(MESSAGE + USERNAME, welcomeUser);
   }

   @Test(expected = AssertionError.class)
   public void testWelcomeUserFailure() {
      String welcomeUser = service.welcomeUser("markus");
      assertEquals("markus", welcomeUser);
   }

}
