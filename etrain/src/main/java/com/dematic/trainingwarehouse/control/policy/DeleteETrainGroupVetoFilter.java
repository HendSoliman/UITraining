/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.policy;

import com.dematic.trainingwarehouse.entity.ETrainGroup;

/**
 * @author Markus Leichter
 *
 */
public class DeleteETrainGroupVetoFilter implements ETrainGroupVetoFilter {

   /* (non-Javadoc)
    * @see com.dematic.trainingwarehouse.control.policy.ETrainGroupVetoFilter#isOkToDelete(com.dematic.trainingwarehouse.entity.ETrainGroup)
    */
   @Override
   public boolean isOkToDelete(ETrainGroup group) {
      if (group.getGroupName().equalsIgnoreCase("superusergroup")) {
         return false;
      }
      return true;
   }

}
