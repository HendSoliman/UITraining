/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.alarms;

import static com.dematic.trainingwarehouse.boundary.alarms.ETrainAlarmConstants.ALARM_DOMAIN_ID;

import com.dematic.wms.app.alarm.control.BaseAlarm;
import com.dematic.wms.app.alarm.entity.domainvalue.AlarmClassification;

/**
 * @author Markus Leichter
 *
 */
public class ETrainAlarm extends BaseAlarm {

   public ETrainAlarm(String alarmParameter) {
      
      super(ALARM_DOMAIN_ID, "0001", 
            AlarmClassification.INFO,
            "ETrainAlarm {alarmParameter} finished");
      
      addMessageParameter("alarmParameter", alarmParameter);
      defineDefaultLifeCycleAsAckGoneLifeCycle();
   }

   /**
    * Standard constructor used for CDI based initialization 
    */
   public ETrainAlarm() {
      this(null);
   }
}
