/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.numbering;

import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.numbering.control.NumberFormatting;

/**
 * @author Markus Leichter
 *
 */
public class ETrainUserNumberFormatingPolicy extends AbstractCDIBean implements NumberFormatting {

   private static final long serialVersionUID = 1L;

   /* (non-Javadoc)
    * @see com.dematic.wms.app.numbering.control.NumberFormatting#formatValue(java.lang.String)
    */
   @Override
   public String formatValue(String value) {
      if (value != null) {
         return "~~~" + ETrainUserNumberFormatingPolicy.class.getSimpleName() + "~~~@@@~~~" + value.toUpperCase() + "~~~";
      }
      return null;
   }

}
