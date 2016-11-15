/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.dematic.wms.app.config.boundary.ConfigurationFileSpec;
import com.dematic.wms.app.config.boundary.app.ConfigurationTopic;

/**
 * @author Markus Leichter
 *
 */
@XmlRootElement(name = "ETrainUserTopic")
@XmlAccessorType(XmlAccessType.FIELD)
public class ETrainUserTopic extends ConfigurationTopic<ETrainUserDimension> {

   private static final long serialVersionUID = 1L;

   @XmlElement(required = true)
   private ETrainUserDimension dimensions;

   @XmlElement(required = true)
   private String welcomeMessage = "Hello!";

   public ETrainUserTopic() {

   }

   public ETrainUserTopic(String welcomeMessage) {
      this.welcomeMessage = welcomeMessage;
   }

   @Override
   public ConfigurationFileSpec getConfigurationFileSpec() {
      return new ETrainUserFileSpec();
   }

   public void setDimensions(ETrainUserDimension dimensions) {
      this.dimensions = dimensions;
   }

   @Override
   public ETrainUserDimension getDimensions() {
      return dimensions;
   }

   public String getWelcomeMessage() {
      return welcomeMessage;
   }

   public void setWelcomeMessage(String welcomeMessage) {
      this.welcomeMessage = welcomeMessage;
   }

   @Override
   public ConfigurationTopic<ETrainUserDimension> createSample() {
      ETrainUserTopic sample = new ETrainUserTopic();
      ETrainUserDimension dimension = new ETrainUserDimension("lemarkus");
      sample.setDimensions(dimension);
      sample.setWelcomeMessage("Servus");

      return sample;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((dimensions == null) ? 0 : dimensions.hashCode());
      result = prime * result + ((welcomeMessage == null) ? 0 : welcomeMessage.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      ETrainUserTopic other = (ETrainUserTopic) obj;
      if (dimensions == null) {
         if (other.dimensions != null)
            return false;
      } else if (!dimensions.equals(other.dimensions))
         return false;
      if (welcomeMessage == null) {
         if (other.welcomeMessage != null)
            return false;
      } else if (!welcomeMessage.equals(other.welcomeMessage))
         return false;
      return true;
   }

}
