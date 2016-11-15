/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import com.dematic.wms.app.base.entity.AbstractTechnicalEntity;

/**
 * @author Markus Leichter
 */
public class SimpleTechnicalEntity extends AbstractTechnicalEntity {

   protected String myName;

   public String getMyName() {
      return myName;
   }

   public void setMyName(String myName) {
      this.myName = myName;
   }
}
