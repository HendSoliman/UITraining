package com.dematic.trainingwarehouse.entity;

import javax.persistence.Entity;

import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.AuditOverrides;
import org.hibernate.envers.Audited;

import com.dematic.wms.app.base.entity.AbstractEntity;
import com.dematic.wms.app.base.entity.AbstractEntityWithoutVersion;
import com.dematic.wms.app.base.entity.AbstractOptimisticLockEntity;
import com.dematic.wms.app.base.entity.annotation.Substitute;
import com.dematic.wms.app.user.entity.User;

@Substitute
@Entity
@Audited
@AuditOverrides({@AuditOverride(forClass = AbstractEntityWithoutVersion.class, isAudited = true),
         @AuditOverride(forClass = AbstractOptimisticLockEntity.class, isAudited = true),
         @AuditOverride(forClass = AbstractEntity.class, isAudited = true)})
public class ProjectUser extends User {

   private String projectAttribute;

   public String getProjectAttribute() {
      return projectAttribute;
   }

   public void setProjectAttribute(String projectAttribute) {
      this.projectAttribute = projectAttribute;
   }

}
