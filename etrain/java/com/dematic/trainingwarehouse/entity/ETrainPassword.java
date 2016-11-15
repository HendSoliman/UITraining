/**
 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.AuditOverrides;
import org.hibernate.envers.Audited;

import com.dematic.wms.app.base.entity.AbstractEntity;
import com.dematic.wms.app.base.entity.AbstractEntityWithoutVersion;
import com.dematic.wms.app.base.entity.AbstractOptimisticLockEntity;

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
@Table(name = ETrainPassword.TABLE_NAME)
@NamedQueries(value = {@NamedQuery(name = ETrainPassword.FIND_ALL, query = "SELECT password FROM ETrainPassword password")})
public class ETrainPassword extends AbstractEntity {

   public static final String TABLE_NAME = "ETRAIN_PASSWORD";

   private static final long serialVersionUID = 1L;

   public static final String FIND_ALL = "ETrainPassword.findAll";

   /** @see getPassword()  */
   String password;

   /** @see getEncryptedValue()  */
   byte[] encryptedValue;

   protected ETrainPassword() {
   }

   /**
    * @return the password
    */
   public String getPassword() {
      return password;
   }

   /**
    * @param password
    *            the password to set
    */
   public void setPassword(String password) {
      this.password = password;
   }

   /**
    * @return the encryptedValue
    */
   public byte[] getEncryptedValue() {
      return encryptedValue;
   }

   /**
    * @param encryptedValue the encryptedValue to set
    */
   public void setEncryptedValue(byte[] encryptedValue) {
      this.encryptedValue = encryptedValue;
   }

}
