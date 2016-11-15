/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.cronjob;

import java.util.ArrayList;
import java.util.List;

import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.wms.app.cron.control.CronjobHandler;
import com.dematic.wms.app.cron.control.CronjobMonitor;
import com.dematic.wms.app.cron.control.config.CronjobTopic;
import com.dematic.wms.app.cron.control.util.DemonTopicBuilder;
import com.dematic.wms.app.cron.control.util.EmptyCronjobConfiguration;

/**
 * @author Markus Leichter
 *
 */
public class CreateETrainUsersCronjob extends CronjobHandler<EmptyCronjobConfiguration> {

   /* (non-Javadoc)
    * @see com.dematic.wms.app.cron.control.CronjobHandler#execute(com.dematic.wms.app.cron.control.config.CronjobConfiguration, com.dematic.wms.app.cron.control.CronjobMonitor)
    */
   @Override
   public void execute(EmptyCronjobConfiguration configuration, CronjobMonitor monitor) {
      ETrainUser eTrainUser = createInstance(ETrainUser.class);
      eTrainUser.setUserName("userName" + System.currentTimeMillis());
      em.persist(eTrainUser);
      getLogger().error("ERROR: Created EtrainUser {}", eTrainUser);
      getLogger().warn("WARN : Created EtrainUser {}", eTrainUser);
      getLogger().debug("DEBUG: Created EtrainUser {}", eTrainUser);
      getLogger().info("INFO : Created EtrainUser {}", eTrainUser);
      getLogger().trace("TRACE: Created EtrainUser {}", eTrainUser);

   }

   /* (non-Javadoc)
    * @see com.dematic.wms.app.cron.control.CronjobHandler#getDefaultConfiguration()
    */
   @Override
   public List<CronjobTopic> getDefaultConfiguration() {
      List<CronjobTopic> resultList = new ArrayList<>();
      resultList.add(new DemonTopicBuilder(CreateETrainUsersCronjob.class.getSimpleName(), CreateETrainUsersCronjob.class,
               DemonTopicBuilder.INTERVAL_EVERY_MINUTE)
               .active(true).build());
      return resultList;
   }
}
