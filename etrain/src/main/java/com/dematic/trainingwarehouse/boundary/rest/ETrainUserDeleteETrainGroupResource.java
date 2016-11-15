/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.dematic.trainingwarehouse.boundary.ETrainUserManagementAdministrator;
import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 *
 */
@Path("delete")
@Stateless
public class ETrainUserDeleteETrainGroupResource extends AbstractStateless {

   @Inject
   private ETrainUserManagementAdministrator administrator;

   @POST
   @Path("{groupname}")
   public Response createGroup(@PathParam("groupname") String groupName) {
      ETrainGroup group = ef.createInstance(ETrainGroup.class);
      group.setGroupName(groupName);
      group.setDescription("Description:" + groupName);
      em.persist(group);

      return Response.ok("CREATED " + group.toString()).build();
   }

   @DELETE
   @Path("{groupname}")
   public Response deleteGroup(@PathParam("groupname") String groupName) {
      administrator.deleteETrainGroup(groupName);

      return Response.ok("DELETED" + groupName).build();
   }

}
