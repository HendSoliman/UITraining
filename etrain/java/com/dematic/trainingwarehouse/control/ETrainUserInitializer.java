/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control;

import javax.inject.Inject;

import com.dematic.trainingwarehouse.control.numbering.ETrainUserNumberFormatingPolicy;
import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.base.control.ComponentInitializer;
import com.dematic.wms.app.base.control.PolicyProvider;
import com.dematic.wms.app.base.entity.PolicyDescription;
import com.dematic.wms.app.numbering.entity.NumberRange;

/**
 * @author Markus Leichter
 *
 */
public class ETrainUserInitializer extends AbstractCDIBean implements ComponentInitializer {

   public static final String NUMBER_RANGE_ID = "ETrainUserNumberRange";

   @Inject
   private PolicyProvider policyProvider;

   /* (non-Javadoc)
    * @see com.dematic.wms.app.base.control.ComponentInitializer#init()
    */
   @Override
   public void init() {
      configureNumberGenerator();
   }

   private void configureNumberGenerator() {
      NumberRange numberRange = createInstance(NumberRange.class);
      numberRange.setId(NUMBER_RANGE_ID);
      if (ep.find(numberRange) != null) {
         return;
      }
      PolicyDescription<ETrainUserNumberFormatingPolicy> policyDescription = policyProvider
               .getPolicyDescription(ETrainUserNumberFormatingPolicy.class);
      numberRange.setNumberFormatter(policyDescription);
      numberRange.setRecentValue("0000000000");
      em.persist(numberRange);

   }

}
