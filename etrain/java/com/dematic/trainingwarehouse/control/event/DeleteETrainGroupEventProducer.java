/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.event;

import javax.inject.Inject;

import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.event.boundary.EventProducer;

/**
 * @author Markus Leichter
 *
 */
public class DeleteETrainGroupEventProducer extends AbstractCDIBean {

   @Inject
   private EventProducer eventProducer;

   public void raiseEvent(ETrainGroup eTrainGroup) {
      DeleteETrainGroupEvent event = new DeleteETrainGroupEvent(eTrainGroup.getGroupName());
      eventProducer.fireEvent(event);
   }

}
