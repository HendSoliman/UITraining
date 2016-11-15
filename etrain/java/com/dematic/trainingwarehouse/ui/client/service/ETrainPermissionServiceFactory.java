/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.service;

import com.google.gwt.core.client.GWT;

/**
 * service factory for ETrainPermissionDto
 * @author Hend Soliman
 */

public class ETrainPermissionServiceFactory {

   private static ETrainPermissionServiceAsync instance;

   static public ETrainPermissionServiceAsync getService() {

      if (instance == null) {
         instance = GWT.create(ETrainPermissionService.class);
      }

      return instance;
   }
}
