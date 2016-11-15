/*
 * Copyright (c) Dematic GmbH {year}. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.cronjob;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

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
public class ListETrainUsersCronjob extends CronjobHandler<EmptyCronjobConfiguration> {

   @Override
   public void execute(EmptyCronjobConfiguration configuration, CronjobMonitor monitor) {
      TypedQuery<ETrainUser> query = em.createQuery("from ETrainUser e", ETrainUser.class);
      List<ETrainUser> list = query.getResultList();
      for (ETrainUser user : list) {
         getLogger().info("-----------> found user: " + user);
      }
   }

   /* (non-Javadoc)
    * @see com.dematic.wms.app.cron.control.CronjobHandler#getDefaultConfiguration()
    */
   @Override
   public List<CronjobTopic> getDefaultConfiguration() {
      List<CronjobTopic> defaultTopics = new ArrayList<>();
      defaultTopics.add(new DemonTopicBuilder(ListETrainUsersCronjob.class.getSimpleName(),
               ListETrainUsersCronjob.class,
               DemonTopicBuilder.INTERVAL_EVERY_MINUTE).active(true).build());
      return defaultTopics;
   }

}
