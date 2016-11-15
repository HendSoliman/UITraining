/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.AuditOverrides;
import org.hibernate.envers.Audited;
import org.hibernate.validator.constraints.Length;

import com.dematic.wms.app.base.entity.AbstractEntity;
import com.dematic.wms.app.base.entity.AbstractEntityWithoutVersion;
import com.dematic.wms.app.base.entity.AbstractOptimisticLockEntity;
import com.dematic.wms.app.base.entity.annotation.LogicalKeyPart;
import com.dematic.wms.app.tracing.DoNotTrace;

/**
 * @author Markus Leichter
 *
 */
@Entity
@Audited
@AuditOverrides({
         @AuditOverride(forClass = AbstractEntityWithoutVersion.class, isAudited = true),
         @AuditOverride(forClass = AbstractOptimisticLockEntity.class, isAudited = true),
         @AuditOverride(forClass = AbstractEntity.class, isAudited = true)
})
@NamedQueries(value = {
         @NamedQuery(name = ETrainTerminal.FIND_BY_NAME, query = "SELECT terminal FROM ETrainTerminal terminal")})
@Table(name = ETrainTerminal.TABLE_NAME)
@DiscriminatorColumn(name = "DISCRIMINATOR")
@ValidIP
public class ETrainTerminal extends AbstractEntity {

   private static final long serialVersionUID = 1L;

   public static final String TABLE_NAME = "ETRAIN_TERMINAL";

   public static final String FIND_BY_NAME = "ETrainTerminal.FIND_BY_NAME";

   @LogicalKeyPart
   @NotNull
   @Length(min = 8)
   protected String terminalName;

   
   @NotNull
   @Column(unique = true)
   protected String ipAddress;

   @Min(0)
   @Max(10)
   protected int terminalNumber;

   @NotNull
   @Embedded
   @AttributeOverride(name = "value", column = @Column(name = "TERMINAL_TYPE"))
   protected ETrainTerminalType type;

   @ManyToOne
   @JoinColumn(name = "ETRAIN_USER_PK")
   protected ETrainUser user;

   protected ETrainTerminal() {

   }

   /**
    * @return the terminalName
    */
   public String getTerminalName() {
      return terminalName;
   }

   /**
    * @param terminalName the name to set
    */
   public void setName(String terminalName) {
      this.terminalName = terminalName;
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
   public ETrainTerminalType getType() {
      return type;
   }

   /**
    * @param type the type to set
    */
   public void setType(ETrainTerminalType type) {
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
