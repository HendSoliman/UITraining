/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.dematic.wms.app.base.entity.AbstractEntity;
import com.dematic.wms.app.base.entity.annotation.LogicalKeyPart;
import com.dematic.wms.app.tracing.DoNotTrace;
import com.dematic.wms.ddlgenerator.NoAuditTrail;

/**
 * @author Markus Leichter
 *
 */
@Entity
@NoAuditTrail
@NamedQueries(value = {
         @NamedQuery(name = ETrainTerminalSimple.FIND_BY_NAME, query = "SELECT terminal FROM ETrainTerminalSimple terminal")})
@Table(name = ETrainTerminalSimple.TABLE_NAME)
public class ETrainTerminalSimple extends AbstractEntity {

   private static final long serialVersionUID = 1L;

   public static final String TABLE_NAME = "ETRAIN_TERMINAL_SIMPLE";

   public static final String FIND_BY_NAME = "ETrainTerminalSimple.FIND_BY_NAME";

   @LogicalKeyPart
   @NotNull
   protected String terminalName;

   @NotNull
   protected String ipAddress;

   protected int terminalNumber;

   @NotNull
   protected String type;

   @ManyToOne
   @JoinColumn(name = "ETRAIN_USER")
   protected ETrainUser user;

   protected ETrainTerminalSimple() {

   }

   /**
    * @return the name
    */
   public String getName() {
      return terminalName;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name) {
      this.terminalName = name;
   }

   /**
    * @return the ipAddress
    */
   public String getIpAddress() {
      return ipAddress;
   }

   /**
    * @param ipAddress the ipAddress to set
    */
   public void setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
   }

   /**
    * @return the number
    */
   public int getTerminalNumber() {
      return terminalNumber;
   }

   /**
    * @param number the number to set
    */
   public void setTerminalNumber(int number) {
      this.terminalNumber = number;
   }

   /**
    * @return the type
    */
   public String getType() {
      return type;
   }

   /**
    * @param type the type to set
    */
   public void setType(String type) {
      this.type = type;
   }

   /**
    * @return the user
    */
   public ETrainUser getUser() {
      return user;
   }

   /**
    * @param user the user to set
    */
   public void setUser(ETrainUser user) {
      this.user = user;
   }

   /* (non-Javadoc)
    * @see com.dematic.wms.app.base.entity.AbstractEntityWithoutVersion#toString()
    */
   @Override
   @DoNotTrace
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }

}
