/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 */
@Path("technical")
@Stateless
public class TechnicalEntiyResource extends AbstractStateless {


   @Inject
   TechnicalEntiyService service;

   @POST
   public String raiseAlarm() {
      StringBuffer buffer = new StringBuffer();
      for (int i = 0; i < 10; i++) {
         final String name = "markus" + i;
         service.create(name);
         buffer.append(name).append("\n");
      }
      return buffer.toString();
   }


}
