/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.startsWith;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.dematic.trainingwarehouse.control.config.ETrainUserDimension;
import com.dematic.trainingwarehouse.control.config.ETrainUserTopic;
import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.wms.app.base.AbstractStateless;
import com.dematic.wms.app.config.boundary.ConfigurationReader;
import com.dematic.wms.app.config.boundary.ConfigurationTopicProvider;

/**
 * @author Markus Leichter
 *
 */
@Stateless
public class ETrainUserManagementService extends AbstractStateless {

   @Inject
   protected ETrainUserProvider eTrainUserProvider;

   @Inject
   protected ConfigurationReader configurationReader;

   /**
    * 
    * @param username has to start with "user", e.g. "userMarkus"
    * @return
    */
   public String welcomeUser(String username) {
      assertThat("EtrainUser", username, notNullValue());
      assertThat("username ", username, startsWith("user"));

      ETrainUser user = eTrainUserProvider.getETrainUserByName(username);
      if (user == null) {
         user = createInstance(ETrainUser.class);
         user.setUserName(username);
         em.persist(user);
      }

      return getWelcomeMessage(user.getUserName());
   }

   /**
    * @param userName
    * @return
    */
   private String getWelcomeMessage(String userName) {
      ConfigurationTopicProvider<ETrainUserDimension, ETrainUserTopic> configurationTopicProvider = configurationReader
               .read(ETrainUserTopic.class);
      ETrainUserTopic welcomeUserTopic = configurationTopicProvider.get(new ETrainUserDimension(userName));
      return welcomeUserTopic.getWelcomeMessage() + userName;
   }

}
