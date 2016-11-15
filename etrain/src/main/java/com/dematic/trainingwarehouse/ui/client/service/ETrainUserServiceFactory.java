/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.service;

import com.google.gwt.core.client.GWT;

/**
 * service factory for ETrainUserDto
 * @author Hend Soliman
 */

public class ETrainUserServiceFactory {

   private static ETrainUserServiceAsync instance;

   static public ETrainUserServiceAsync getService() {

      if (instance == null) {
         instance = GWT.create(ETrainUserService.class);
      }

      return instance;
   }
}
