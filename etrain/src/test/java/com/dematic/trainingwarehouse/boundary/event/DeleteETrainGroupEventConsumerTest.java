/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.event;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Markus Leichter
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class DeleteETrainGroupEventConsumerTest {

   DeleteETrainGroupEventConsumer consumer;

   @Mock
   DeleteETrainGroupEvent deleteEventMock;

   /**
    * @throws java.lang.Exception
    */
   @Before
   public void setUp() throws Exception {
      consumer = new DeleteETrainGroupEventConsumer();
   }

   @Test
   public void testSynchronous() {
      consumer.handleEvent(deleteEventMock);
      verify(deleteEventMock).getGroupName();

   }

   @Test
   public void testAsynchronous() {

      consumer.handleEventAsynchronous(deleteEventMock);
      verify(deleteEventMock).getGroupName();

   }
}
