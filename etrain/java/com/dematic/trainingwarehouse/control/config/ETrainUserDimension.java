/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.dematic.wms.app.config.boundary.Dimensions;

/**
 * @author Markus Leichter
 *
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class ETrainUserDimension implements Dimensions {

   private static final long serialVersionUID = 1L;

   @XmlElement(required = true)
   private String username;

   public ETrainUserDimension() {

   }

   /**
    *
    * @param username
    */
   public ETrainUserDimension(String username) {
      this.username = username;
   }

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

   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((username == null) ? 0 : username.hashCode());
      return result;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      ETrainUserDimension other = (ETrainUserDimension) obj;
      if (username == null) {
         if (other.username != null)
            return false;
      } else if (!username.equals(other.username))
         return false;
      return true;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      return "WelcomeUserDimension [username=" + username + "]";
   }

}
