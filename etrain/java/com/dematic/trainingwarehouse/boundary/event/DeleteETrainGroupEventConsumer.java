/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.event;

import javax.ejb.Asynchronous;
import javax.enterprise.event.Observes;

import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.event.boundary.qualifier.AsynchronousReceiving;

/**
 * @author Markus Leichter
 *
 */
public class DeleteETrainGroupEventConsumer extends AbstractCDIBean {

   public void handleEvent(@Observes DeleteETrainGroupEvent deleteEvent) {
      getLogger().info("Deleting group " + deleteEvent.getGroupName() + " synchronously");
   }

   @Asynchronous
   public void handleEventAsynchronous(@Observes DeleteETrainGroupEvent deleteEvent) {
      getLogger().info("Deleting group " + deleteEvent.getGroupName() + " @Asynchronous");
   }

   public void handleEventAsynchronousReceiving(@Observes @AsynchronousReceiving DeleteETrainGroupEvent deleteEvent) {
      getLogger().info("Deleting group " + deleteEvent.getGroupName() + " @AsynchronousReceiving");
   }
}
