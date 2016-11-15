/*
s * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.dematic.trainingwarehouse.boundary.ETrainUserProvider;
import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 *
 */
@Path("etrainaudit")
@Stateless
public class ETrainAuditResource extends AbstractStateless {

   @Inject
   ETrainUserProvider provider;

   @POST
   @Path("{username}")
   public Response auditUser(@PathParam("username") String username) {

      ETrainUser etrainUser = provider.getETrainUserByName(username);
      if (etrainUser == null) {
         etrainUser = createInstance(ETrainUser.class);
         etrainUser.setUserName(username);
         em.persist(etrainUser);
      } else {
         etrainUser.setFullName(etrainUser.getUserName() + System.currentTimeMillis());
      }

      return Response.ok(ToStringBuilder.reflectionToString(etrainUser, ToStringStyle.MULTI_LINE_STYLE)).build();
   }

}
