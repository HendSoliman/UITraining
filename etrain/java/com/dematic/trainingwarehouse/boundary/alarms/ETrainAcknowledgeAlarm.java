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
public class ETrainAcknowledgeAlarm extends BaseAlarm {

   public ETrainAcknowledgeAlarm(String alarmParameter) {
      
      super(ALARM_DOMAIN_ID, 
            "0002", 
            AlarmClassification.WARNING, 
            "ETrainAcknowledgeAlarm {alarmParameter} is here");
      
      addMessageParameter("alarmParameter", alarmParameter);
      defineDefaultLifeCycleAsAckLifeCycle();
   }

   /**
    * Standard constructor used for CDI based initialization 
    */
   public ETrainAcknowledgeAlarm() {
      this(null);
   }
}
