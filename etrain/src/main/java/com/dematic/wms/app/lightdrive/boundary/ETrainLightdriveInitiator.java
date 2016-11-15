/*
 * Copyright (c) Dematic GmbH 2014. All rights reserved. Confidential.
 */
package com.dematic.wms.app.lightdrive.boundary;

import javax.enterprise.inject.Default;

/**
 * @author Markus Leichter
 */
@Default
public class ETrainLightdriveInitiator implements LightdriveInitiator {
   @Override
   public void confirmLight(String locationId, Integer qty, PickState pickState, int taskId) {

   }

   @Override
   public void buttonPressed(String locationId, Button button) {

   }

   @Override
   public void comPortData(byte[] data) {

   }
}
