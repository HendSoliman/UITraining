/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.numbering;

import javax.inject.Inject;

import com.dematic.trainingwarehouse.control.ETrainUserInitializer;
import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.numbering.boundary.NumberGenerator;

/**
 * @author Markus Leichter
 *
 */
public class ETrainUserNumberGenerator extends AbstractCDIBean {

   @Inject
   private NumberGenerator numberGenerator;

   public String createNumber() {
      String createFormattedNumber = numberGenerator.createFormattedNumber(ETrainUserInitializer.NUMBER_RANGE_ID);

      return createFormattedNumber;
   }

}
