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
import com.dematic.wms.app.base.entity.annotation.LogicalKeyPart;

/**
 * Permision encapsulates the permission for gui
 * 
 * @author lemarkus
 * 
 */
@Entity
@Audited
@AuditOverrides({
         @AuditOverride(forClass = AbstractEntityWithoutVersion.class, isAudited = true),
         @AuditOverride(forClass = AbstractOptimisticLockEntity.class, isAudited = true),
         @AuditOverride(forClass = AbstractEntity.class, isAudited = true)
})
@Table(name = ETrainPermission.TABLE_NAME)
@NamedQueries(value = {
         @NamedQuery(name = ETrainPermission.FIND_ALL, query = "SELECT permission FROM ETrainPermission permission")})
public class ETrainPermission extends AbstractEntity {

   public static final String TABLE_NAME = "ETRAIN_PERMISSION";

   private static final long serialVersionUID = 1L;

   public static final String FIND_ALL = "ETrainPermission.findAll";

   /** @see getPermissionName() */
   @LogicalKeyPart
   String permissionName;

   /** @see getDescription() */
   String description;

   /** @see isAdminOnly() */
   boolean adminOnly;

   protected ETrainPermission() {

   }

   /**
    * @return the permissionName
    */
   public String getPermissionName() {
      return permissionName;
   }

   /**
    * @param permissionName
    *            the permissionName to set
    */
   public void setPermissionName(String permissionName) {
      this.permissionName = permissionName;
   }

   /**
    * @return the description
    */
   public String getDescription() {
      return description;
   }

   /**
    * @param description
    *            the description to set
    */
   public void setDescription(String description) {
      this.description = description;
   }

   /**
    * @return the adminOnly
    */
   public boolean isAdminOnly() {
      return adminOnly;
   }

   /**
    * @param adminOnly
    *            the adminOnly to set
    */
   public void setAdminOnly(boolean adminOnly) {
      this.adminOnly = adminOnly;
   }

}
