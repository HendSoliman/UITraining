/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.envers.Audited;

import com.dematic.wms.app.base.entity.AbstractEntity;
import com.dematic.wms.app.base.entity.annotation.LogicalKeyPart;
import com.dematic.wms.app.tracing.DoNotTrace;

/**
 * @author Markus Leichter
 *
 */
@Audited
@Entity
@Table(name = ETrainVehicle.TABLE_NAME)
public class ETrainVehicle extends AbstractEntity {

   private static final long serialVersionUID = 1L;

   public static final String TABLE_NAME = "ETRAIN_VEHICLE";

   @LogicalKeyPart(index = 1)
   @NotNull
   private String name;

   @LogicalKeyPart(index = 2)
   @Column(name="VEHICLE_NUMBER")
   private Long number;

   protected ETrainVehicle() {

   }

   /* (non-Javadoc)
    * @see com.dematic.wms.app.base.entity.AbstractEntityWithoutVersion#toString()
    */
   @Override
   @DoNotTrace
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }

   /**
    * @return the number
    */
   public Long getNumber() {
      return number;
   }

   /**
    * @param number the number to set
    */
   public void setNumber(Long number) {
      this.number = number;
   }

   /**
    * @return the name
    */
   public String getName() {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name) {
      this.name = name;
   }

}
