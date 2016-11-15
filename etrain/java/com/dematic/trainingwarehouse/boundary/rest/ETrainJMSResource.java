/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.dematic.trainingwarehouse.control.jms.ETrainJmsReceiver;
import com.dematic.trainingwarehouse.control.jms.ETrainJmsSender;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 *
 */
@Path("jms")
@Stateless
public class ETrainJMSResource extends AbstractStateless {

   @Inject
   ETrainJmsSender sender;

   @Inject
   ETrainJmsReceiver receiver;

   @GET
   public Response receive() {
      String message = receiver.receive();
      return Response.ok(message).build();
   }

   @POST
   @Path("{message}")
   public Response welcomeUser(@PathParam("message") String message) {

      sender.sendMessage(message);

      return Response.ok("Sent message:" + message).build();
   }

}
