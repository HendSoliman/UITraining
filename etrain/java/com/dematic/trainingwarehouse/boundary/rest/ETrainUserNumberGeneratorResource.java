/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.dematic.trainingwarehouse.control.ETrainUserInitializer;
import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.numbering.boundary.NumberGenerator;

/**
 * @author Markus Leichter
 *
 */
@Path("number")
@Stateless
public class ETrainUserNumberGeneratorResource extends AbstractCDIBean {

   @Inject
   private NumberGenerator numberGenerator;

   @GET
   public String createNumber() {
      String createFormattedNumber = numberGenerator.createFormattedNumber(ETrainUserInitializer.NUMBER_RANGE_ID);

      return createFormattedNumber;
   }

}
