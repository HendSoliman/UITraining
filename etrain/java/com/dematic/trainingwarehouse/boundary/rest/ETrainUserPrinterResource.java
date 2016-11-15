/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.dematic.trainingwarehouse.control.print.ETrainUserPrinter;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 *
 */
@Path("printer")
@Stateless
public class ETrainUserPrinterResource extends AbstractStateless {

   @Inject
   private ETrainUserPrinter eTrainUserPrinter;

   @POST
   @Path("{username}")
   public Response printUser(@PathParam("username") String username) {
      eTrainUserPrinter.printEtrainUser(username);

      return Response.ok(username).build();
   }

}
