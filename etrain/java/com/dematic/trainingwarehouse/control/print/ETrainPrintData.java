/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.print;

import javax.xml.bind.annotation.XmlRootElement;

import com.dematic.wms.app.print.boundary.DocumentData;

/**
 * @author Markus Leichter
 *
 */
@XmlRootElement
public class ETrainPrintData implements DocumentData {

   private static final long serialVersionUID = -1042224629913797268L;

   private String username;

   /**
    * @return the username
    */
   public String getUsername() {
      return username;
   }

   /**
    * @param username the username to set
    */
   public void setUsername(String username) {
      this.username = username;
   }

}
