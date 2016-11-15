/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.cronjob;

import java.util.ArrayList;
import java.util.List;

import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.wms.app.cron.control.CronjobHandler;
import com.dematic.wms.app.cron.control.CronjobMonitor;
import com.dematic.wms.app.cron.control.config.CronjobBatchSchedule;
import com.dematic.wms.app.cron.control.config.CronjobTopic;
import com.dematic.wms.app.cron.control.util.BatchTopicBuilder;
import com.dematic.wms.app.cron.control.util.EmptyCronjobConfiguration;

/**
 * @author Markus Leichter
 *
 */
public class CreateETrainUsersBatch extends CronjobHandler<EmptyCronjobConfiguration> {

   /* (non-Javadoc)
    * @see com.dematic.wms.app.cron.control.CronjobHandler#execute(com.dematic.wms.app.cron.control.config.CronjobConfiguration, com.dematic.wms.app.cron.control.CronjobMonitor)
    */
   @Override
   public void execute(EmptyCronjobConfiguration configuration, CronjobMonitor monitor) {
      ETrainUser eTrainUser = createInstance(ETrainUser.class);
      eTrainUser.setUserName("userName-" + System.currentTimeMillis());
      em.persist(eTrainUser);
   }

   /* (non-Javadoc)
    * @see com.dematic.wms.app.cron.control.CronjobHandler#getDefaultConfiguration()
    */
   @Override
   public List<CronjobTopic> getDefaultConfiguration() {
      List<CronjobTopic> resultList = new ArrayList<>();
      CronjobBatchSchedule midnightSchedule = new CronjobBatchSchedule("*", "*", "*", "*", "0", "0", "0");
      resultList.add(new BatchTopicBuilder(CreateETrainUsersBatch.class.getSimpleName(), CreateETrainUsersBatch.class,
               midnightSchedule)
               .active(true).build());
      return resultList;
   }
}
