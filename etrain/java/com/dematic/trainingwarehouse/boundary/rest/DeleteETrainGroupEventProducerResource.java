/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.dematic.trainingwarehouse.boundary.event.DeleteETrainGroupEventProducer;
import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 *
 */
@Path("event")
@Stateless
public class DeleteETrainGroupEventProducerResource extends AbstractStateless {

   @Inject
   DeleteETrainGroupEventProducer eventProducer;

   @POST
   public String fireEvent() {
      ETrainGroup eTrainGroup = ef.createInstance(ETrainGroup.class);
      eTrainGroup.setGroupName("groupName");
      eventProducer.raiseEvent(eTrainGroup);

      return "super";
   }

}
