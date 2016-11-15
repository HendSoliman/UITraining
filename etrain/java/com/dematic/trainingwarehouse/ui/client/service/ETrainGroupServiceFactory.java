/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.service;

import com.google.gwt.core.client.GWT;

/**
 * service factory for ETrainGroupDto
 * @author Hend Soliman
 */

public class ETrainGroupServiceFactory {

   private static ETrainGroupServiceAsync instance;

   static public ETrainGroupServiceAsync getService() {

      if (instance == null) {
         instance = GWT.create(ETrainGroupService.class);
      }

      return instance;
   }
}
