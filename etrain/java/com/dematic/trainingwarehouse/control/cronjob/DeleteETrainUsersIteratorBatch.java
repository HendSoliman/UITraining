/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.cronjob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.trainingwarehouse.entity.ETrainUser_;
import com.dematic.wms.app.base.control.ScrollableQueryResult;
import com.dematic.wms.app.cron.control.AbstractIteratorBatch;
import com.dematic.wms.app.cron.control.AbstractObjectListProcessor;
import com.dematic.wms.app.cron.control.config.CronjobBatchSchedule;
import com.dematic.wms.app.cron.control.config.CronjobTopic;
import com.dematic.wms.app.cron.control.util.BatchTopicBuilder;
import com.dematic.wms.app.cron.control.util.EmptyCronjobConfiguration;

/**
 * @author Markus Leichter
 *
 */
public class DeleteETrainUsersIteratorBatch extends AbstractIteratorBatch<EmptyCronjobConfiguration, ETrainUser> {

   @Inject
   private EtrainObjectListProcessor etrainUsersObjectListProcessor;

   /* (non-Javadoc)
    * @see com.dematic.wms.app.cron.control.AbstractIteratorBatch#getObjectListProcessor()
    */
   @Override
   protected AbstractObjectListProcessor<ETrainUser> getObjectListProcessor() {
      return etrainUsersObjectListProcessor;
   }

   /* (non-Javadoc)
    * @see com.dematic.wms.app.cron.control.AbstractIteratorBatch#initialize(com.dematic.wms.app.cron.control.config.CronjobConfiguration)
    */
   @Override
   public ScrollableQueryResult<ETrainUser> initialize(EmptyCronjobConfiguration configuration) {
      Date now = new Date();
      // solution with jpql
      String select = "select e from ETrainUser e where e.createDate < :now";
      TypedQuery<ETrainUser> query = em.createQuery(select, ETrainUser.class);
      query.setParameter("now", now);

      // solution with criteria api
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<ETrainUser> criteriaQuery = cb.createQuery(ETrainUser.class);
      Root<ETrainUser> eTrainUser = criteriaQuery.from(ETrainUser.class);
      criteriaQuery.select(eTrainUser);
      criteriaQuery.where(cb.lessThan(eTrainUser.get(ETrainUser_.createDate), now));
      query = em.createQuery(criteriaQuery);

      return new ScrollableQueryResult<>(query);
   }

   /* (non-Javadoc)
    * @see com.dematic.wms.app.cron.control.CronjobHandler#getDefaultConfiguration()
    */
   @Override
   public List<CronjobTopic> getDefaultConfiguration() {
      List<CronjobTopic> defaultTopics = new ArrayList<>();
      CronjobBatchSchedule schedule = new CronjobBatchSchedule("*", "*", "*", "*", "1", "0", "0");
      CronjobTopic cronjobTopic = new BatchTopicBuilder(DeleteETrainUsersIteratorBatch.class.getSimpleName(),
               DeleteETrainUsersIteratorBatch.class, schedule).active(true).build();
      defaultTopics.add(cronjobTopic);
      return defaultTopics;
   }

}
