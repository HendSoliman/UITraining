/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import com.dematic.wms.app.base.entity.DomainValue;

/**
 * @author Markus Leichter
 *
 */
public class ETrainTerminalType extends DomainValue {

   private static final long serialVersionUID = 1L;

   public static final ETrainTerminalType CLIENT = new ETrainTerminalType("CLIENT");

   public static final ETrainTerminalType BROWSER = new ETrainTerminalType("BROWSER");

   public static final ETrainTerminalType EXTERNAL = new ETrainTerminalType("EXTERNAL");

   protected ETrainTerminalType() {
      super();
   }

   protected ETrainTerminalType(String id) {
      super(id);
   }

}
