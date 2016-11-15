/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.dematic.trainingwarehouse.boundary.alarms.ETrainAcknowledgeAlarm;
import com.dematic.trainingwarehouse.boundary.alarms.ETrainAlarm;
import com.dematic.wms.app.alarm.boundary.AlarmPublicationProcessor;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 */
@Path("alarm")
@Stateless
public class ETrainAlarmRaiseResource extends AbstractStateless {

   @Inject
   protected AlarmPublicationProcessor alarmPublicationProcessor;

   @POST
   public String raiseAlarm() {
      StringBuffer buffer = new StringBuffer();
      for (int i = 0; i < 10; i++) {
         ETrainAlarm eTrainAlarm = new ETrainAlarm("alarmParameter" + System.nanoTime());
         alarmPublicationProcessor.raise(eTrainAlarm);
         buffer.append(eTrainAlarm.toString()).append("\n");
      }
      return buffer.toString();
   }

   @PUT
   public String raiseAcknowledgeAlarm() {
      ETrainAcknowledgeAlarm eTrainAlarm = new ETrainAcknowledgeAlarm("alarmParameter" + System.nanoTime());
      alarmPublicationProcessor.raise(eTrainAlarm);
      return eTrainAlarm.toString();
   }
}
