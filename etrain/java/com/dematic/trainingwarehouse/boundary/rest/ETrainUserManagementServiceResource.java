/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.dematic.trainingwarehouse.boundary.ETrainUserManagementService;
import com.dematic.wms.app.base.AbstractStateless;
import com.dematic.wms.app.tracing.DoNotTrace;
import com.dematic.wms.app.tracing.Traceable;

/**
 * @author Markus Leichter
 *
 */
@Path("welcome")
@Stateless
public class ETrainUserManagementServiceResource extends AbstractStateless {

   @Inject
   private ETrainUserManagementService userManagementService;

   @GET
   @Path("{username}")
   public Response welcomeUser(@PathParam("username") String username) {
      trace(username);
      doNotTrace(username);
      String welcomeMessage = userManagementService.welcomeUser(username);
      return Response.ok(welcomeMessage).build();
   }

   @DoNotTrace
   private void doNotTrace(String username) {
      getLogger().error("This is an ERROR doNotTrace for user {}", username);
      getLogger().warn("This is an WARN doNotTrace for user {}", username);
      getLogger().info("This is an INFO doNotTrace for user {}", username);
      getLogger().debug("This is an DEBUG doNotTrace for user {}", username);
      getLogger().trace("This is an TRACE doNotTrace for user {}", username);
   }

   @Traceable
   private void trace(String username) {
      getLogger().error("This is an ERROR trace for user {}", username);
      getLogger().warn("This is an WARN trace for user {}", username);
      getLogger().info("This is an INFO trace for user {}", username);
      getLogger().debug("This is an DEBUG trace for user {}", username);
      getLogger().trace("This is an TRACE trace for user {}", username);
   }

}
