/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.event;

import com.dematic.wms.app.event.boundary.BaseEvent;

/**
 * @author Markus Leichter
 *
 */
public class DeleteETrainGroupEvent extends BaseEvent {

   private static final long serialVersionUID = 1L;

   private final String groupName;

   public DeleteETrainGroupEvent(String groupName) {
      this.groupName = groupName;
   }

   /**
    * @return the groupName
    */
   public String getGroupName() {
      return groupName;
   }

}
