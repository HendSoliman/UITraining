/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.event;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import com.dematic.trainingwarehouse.control.policy.ETrainGroupVetoFilter;
import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.event.boundary.EventProducer;

/**
 * @author Markus Leichter
 *
 */
public class DeleteETrainGroupEventProducer extends AbstractCDIBean {

   @Inject
   private EventProducer eventProducer;

   @Inject
   private Instance<ETrainGroupVetoFilter> vetoFilters;

   public void raiseEvent(ETrainGroup eTrainGroup) {
      if (isOK(eTrainGroup)) {
         DeleteETrainGroupEvent event = new DeleteETrainGroupEvent(eTrainGroup.getGroupName());
         eventProducer.fireEvent(event);
      }
   }

   /**
    * @param eTrainGroup 
    * @return
    */
   private boolean isOK(ETrainGroup eTrainGroup) {
      for (ETrainGroupVetoFilter vetoFilter : vetoFilters) {
         if (vetoFilter.isOkToDelete(eTrainGroup) == false) {
            return false;
         }
      }
      return true;
   }
}
