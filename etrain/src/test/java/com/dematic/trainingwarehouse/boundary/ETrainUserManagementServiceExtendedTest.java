/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

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
public class ETrainUserManagementServiceExtendedTest {

   private static final String USERNAME = "userlemarkus";
   private static final String MESSAGE = "welcomeYou";
   private ETrainUserManagementServiceExtended serviceExtended;

   @Mock
   private ETrainUserProvider eTrainUserProviderMock;

   @Mock
   private EntityFactory entityFactoryMock;

   @Mock
   ConfigurationReader configurationReaderMock;

   @Mock
   ConfigurationTopicProvider<ETrainUserDimension, ETrainUserTopic> configurationTopicProviderMock;

   @Mock
   ETrainUserTopic eTrainUserTopicMock;

   @Before
   public void setUp() {

      ETrainUser eTrainUser = TestFactory.createInstance(ETrainUser.class);
      eTrainUser.setUserName(USERNAME);
      when(eTrainUserProviderMock.getETrainUserByName(USERNAME)).thenReturn(eTrainUser);
      when(entityFactoryMock.createInstance(eq(ETrainUser.class))).thenReturn(TestFactory.createInstance(ETrainUser.class));
      when(configurationTopicProviderMock.get(any(ETrainUserDimension.class))).thenReturn(eTrainUserTopicMock);
      when(configurationReaderMock.read(eq(ETrainUserTopic.class))).thenReturn(configurationTopicProviderMock);
      when(eTrainUserTopicMock.getWelcomeMessage()).thenReturn(MESSAGE);

      serviceExtended = new ETrainUserManagementServiceExtended();
      serviceExtended.setMockedEntityFactory(entityFactoryMock);
      serviceExtended.configurationReader = configurationReaderMock;
      serviceExtended.eTrainUserProvider = eTrainUserProviderMock;
   }

   @Test
   public void welcomeGuest() {
      String welcomeGuest = serviceExtended.welcomeGuest(USERNAME);
      assertEquals("sukramelresu", welcomeGuest);
   }

   @Test
   public void welcomeUser() {
      String welcomeGuest = serviceExtended.welcomeUser(USERNAME);
      assertEquals("WELCOMEYOUUSERLEMARKUS", welcomeGuest);
   }

}
