/**
 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.envers.AuditJoinTable;
import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.AuditOverrides;
import org.hibernate.envers.Audited;

import com.dematic.wms.app.base.entity.AbstractEntity;
import com.dematic.wms.app.base.entity.AbstractEntityWithoutVersion;
import com.dematic.wms.app.base.entity.AbstractOptimisticLockEntity;
import com.dematic.wms.app.base.entity.annotation.LogicalKeyPart;

/**
 * @author beckerto
 *
 */
@Entity
@Audited
@AuditOverrides({
         @AuditOverride(forClass = AbstractEntityWithoutVersion.class, isAudited = true),
         @AuditOverride(forClass = AbstractOptimisticLockEntity.class, isAudited = true),
         @AuditOverride(forClass = AbstractEntity.class, isAudited = true)
})
@Table(name = ETrainGroup.TABLE_NAME)
@NamedQueries(value = {
         @NamedQuery(name = ETrainGroup.FIND_ALL, query = "SELECT g FROM ETrainGroup g")})
public class ETrainGroup extends AbstractEntity {

   public static final String TABLE_NAME = "ETRAIN_GROUP";

   private static final long serialVersionUID = 1L;

   public static final String FIND_ALL = "ETrainGroup.findAll";

   @LogicalKeyPart
   String groupName;

   @Size(min = 5, max = 20)
   String description;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "ETRAIN_PARENT_GROUP_NAME")
   ETrainGroup parent;

   @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
   List<ETrainGroup> children;

   @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
   @JoinColumn(name = "ETRAIN_GROUP")
   @AuditJoinTable(name = "ETRAIN_GRP_PERM_AUD")
   List<ETrainPermission> permissions;

   @ManyToMany(fetch = FetchType.LAZY)
   @JoinTable(name = "ETRAIN_USER_GROUPS",
            joinColumns = @JoinColumn(name = "GROUPNAME"),
            inverseJoinColumns = @JoinColumn(name = "USERNAME"))
   List<ETrainUser> users;

   protected ETrainGroup() {

   }

   /**
    * @return the groupName
    */
   public String getGroupName() {
      return groupName;
   }

   /**
    * @param groupName
    *            the groupName to set
    */
   public void setGroupName(String groupName) {
      this.groupName = groupName;
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
    * @return the parent
    */
   public ETrainGroup getParent() {
      return parent;
   }

   /**
    * @param parent
    *            the parent to set
    */
   public void setParent(ETrainGroup parent) {
      this.parent = parent;
   }

   /**
    * @return the children
    */
   public List<ETrainGroup> getChildren() {
      return children;
   }

   /**
    * @param children
    *            the children to set
    */
   public void setChildren(List<ETrainGroup> children) {
      this.children = children;
   }

   /**
    * @return the permissions
    */
   public List<ETrainPermission> getPermissions() {
      return permissions;
   }

   /**
    * @param permissions
    *            the permissions to set
    */
   public void setPermissions(List<ETrainPermission> permissions) {
      this.permissions = permissions;
   }

   /**
    * @return the users
    */
   public List<ETrainUser> getUsers() {
      return users;
   }

   /**
    * @param users
    *            the users to set
    */
   public void setUsers(List<ETrainUser> users) {
      this.users = users;
   }

}
