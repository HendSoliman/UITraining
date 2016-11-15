/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

/**
 * @author Markus Leichter
 *
 */
public class ETrainTerminalTypeExtended extends ETrainTerminalType {

   private static final long serialVersionUID = 1L;

   public static final ETrainTerminalType MOBILE = new ETrainTerminalType("MOBILE");

   protected ETrainTerminalTypeExtended() {
      super();
   }
}
