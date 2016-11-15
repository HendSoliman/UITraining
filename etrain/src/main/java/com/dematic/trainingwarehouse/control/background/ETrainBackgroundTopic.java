/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.background;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.dematic.trainingwarehouse.control.config.ETrainUserFileSpec;
import com.dematic.wms.app.backgroundprocessing.boundary.BackgroundProcess;
import com.dematic.wms.app.backgroundprocessing.boundary.config.BackgroundProcessConfigTopic;
import com.dematic.wms.app.config.boundary.ConfigurationFileSpec;
import com.dematic.wms.app.config.boundary.NoDimensions;
import com.dematic.wms.app.config.boundary.app.ConfigurationTopic;

/**
 * @author Markus Leichter
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ETrainBackgroundProcess")
public class ETrainBackgroundTopic extends BackgroundProcessConfigTopic<NoDimensions> {

   private static final long serialVersionUID = 1L;

   @XmlAttribute(required = false)
   private String description ="";
   
   private boolean active = true;

   private long sleepTime = 2_000L;

   
   @Override
   public String getProcessId() {
      return "ETrainBackgroundProcess";
   }

   @Override
   public boolean isActive() {
      return active;
   }

   @Override
   public void setActive(boolean active) {
      this.active = active;
   }

   @Override
   public ConfigurationFileSpec getConfigurationFileSpec() {
      return new ETrainUserFileSpec();
   }

   @Override
   public NoDimensions getDimensions() {
      return new NoDimensions();
   }

   @Override
   public Class<? extends BackgroundProcess<? extends BackgroundProcessConfigTopic<NoDimensions>>> getBackgroundProcessClass() {
      return ETrainBackgroundProcessor.class;
   }

   /* (non-Javadoc)
   * @see com.dematic.wms.app.config.boundary.app.ConfigurationTopic#createSample()
   */
   @Override
   public ConfigurationTopic<NoDimensions> createSample() {
      ETrainBackgroundTopic backgroundTopic = new ETrainBackgroundTopic();
      backgroundTopic.setSleepTime(100_000l);
      return backgroundTopic;
   }

   /**
    * @return the sleepTime
    */
   public long getSleepTime() {
      return sleepTime;
   }

   /**
    * @param sleepTime the sleepTime to set
    */
   public void setSleepTime(long sleepTime) {
      this.sleepTime = sleepTime;
   }

   @Override
   public String getDescription() {
      return description;
   }

}
