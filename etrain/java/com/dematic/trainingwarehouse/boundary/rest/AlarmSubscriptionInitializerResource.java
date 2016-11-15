/*
s * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.dematic.trainingwarehouse.boundary.alarms.ETrainAcknowledgeAlarm;
import com.dematic.trainingwarehouse.boundary.alarms.ETrainAlarm;
import com.dematic.wms.app.alarm.boundary.AlarmSubscriptionProcessor;
import com.dematic.wms.app.alarm.entity.AlarmSubscription;
import com.dematic.wms.app.alarm.entity.domainvalue.SubscriptionType;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 *
 */
@Path("alarminit")
@Stateless
public class AlarmSubscriptionInitializerResource extends AbstractStateless {

   @Inject
   protected AlarmSubscriptionProcessor subscriptionProcessor;

   @POST
   public Response init() {
      configureAlarmSubscriptions();
      return Response.ok().build();
   }


   private void configureAlarmSubscriptions() {
      ETrainAlarm a = new ETrainAlarm();
      AlarmSubscription subscription1 = subscriptionProcessor.subscribe(a.getDomainId(), a.getTypeTypeId(),
               null, SubscriptionType.USER, "SuperUser");
      getLogger().info("Created subscription " + subscription1.getEnglishTechnicalDescription());

      ETrainAcknowledgeAlarm b = new ETrainAcknowledgeAlarm();
      AlarmSubscription subscription2 = subscriptionProcessor.subscribe(b.getDomainId(), b.getTypeTypeId(),
               null, SubscriptionType.USER, "SuperUser");
      getLogger().info("Created subscription " + subscription2.getEnglishTechnicalDescription());

   }

}
