/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.background;

import com.dematic.wms.app.backgroundprocessing.boundary.BackgroundProcess;
import com.dematic.wms.app.backgroundprocessing.boundary.ShutdownMonitor;
import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.base.util.UserTransactionAdapter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * @author Markus Leichter
 *
 */
@RequestScoped
public class ETrainBackgroundProcessor extends AbstractCDIBean implements BackgroundProcess<ETrainBackgroundTopic> {

   @Inject
   UserTransactionAdapter utx;


   @Override
   public void execute(ETrainBackgroundTopic configTopic, ShutdownMonitor shutdownMonitor) {
      String processId = configTopic.getProcessId();
      while (!shutdownMonitor.mustStop()) {
         long sleepTime = configTopic.getSleepTime();
         getLogger().info("########################################## HELLO " + processId + sleepTime);
         try {
            utx.begin();
            Thread.sleep(sleepTime);
            utx.commit();
         } catch (Exception e) {
            utx.rollback();
         }
      }

      getLogger().info("Stopped " + processId);
   }
}
