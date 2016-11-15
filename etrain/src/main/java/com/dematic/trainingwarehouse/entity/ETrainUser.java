/**
 * Copyright (c) Dematic GmbH 2011. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.AuditOverrides;
import org.hibernate.envers.Audited;

import com.dematic.wms.app.base.entity.AbstractEntity;
import com.dematic.wms.app.base.entity.AbstractEntityWithoutVersion;
import com.dematic.wms.app.base.entity.AbstractOptimisticLockEntity;
import com.dematic.wms.app.base.entity.annotation.LogicalKeyPart;

/**
 * @author Markus Leichter
 *
 */
@Audited
@AuditOverrides({
         @AuditOverride(forClass = AbstractEntityWithoutVersion.class, isAudited = true),
         @AuditOverride(forClass = AbstractOptimisticLockEntity.class, isAudited = true),
         @AuditOverride(forClass = AbstractEntity.class, isAudited = true)
})
@Entity
@Table(name = ETrainUser.TABLE_NAME)
@NamedQueries(value = {
         @NamedQuery(name = ETrainUser.FIND_ALL, query = "SELECT user FROM ETrainUser user"),
         @NamedQuery(name = ETrainUser.FIND_BY_NAME, query = "SELECT user FROM ETrainUser user WHERE user.userName = :username"),
         @NamedQuery(name = ETrainUser.FIND_BY_NAME_AND_PASSWORD, query = "SELECT user FROM ETrainUser user WHERE user.userName = :username AND user.password = :password"),
         @NamedQuery(name = ETrainUser.FIND_BY_NAME_AND_PERMISION, query = "SELECT u FROM ETrainUser u , IN(u.groups) g, IN(g.permissions) p "
                  + "WHERE u.userName = :username " + "AND p.permissionName = :permissionname")})
public class ETrainUser extends AbstractEntity {

   public static final String TABLE_NAME = "ETRAIN_USER";

   private static final long serialVersionUID = 1L;

   public static final String FIND_ALL = "ETrainUser.findAll";

   public static final String FIND_BY_NAME = "ETrainUser.findByName";

   public static final String FIND_BY_NAME_AND_PASSWORD = "ETrainUser.findByNameAndPassword";

   public static final String FIND_BY_NAME_AND_PERMISION = "ETrainUser.findByNameAndPermission";

   /** @see getUserName()  */
   @LogicalKeyPart
   String userName;

   /** @see getFullName()  */
   String fullName;

   /** @see getDescription()  */
   String description;

   /** @see isLocked()  */
   boolean locked;

   /** @see isPasswordChangeable()  */
   boolean passwordChangeable;

   /** @see isLoggedOn()  */
   boolean loggedOn;

   /** @see getTimeOfLastLogin()  */
//   @Temporal(TemporalType.TIMESTAMP)
   @Temporal(TemporalType.DATE)
   Date timeOfLastLogin;

   /** @see getTimeOfLastLogout()  */
   //@Temporal(TemporalType.TIMESTAMP)
   @Temporal(TemporalType.DATE)
   Date timeOfLastLogout;

   /** @see getNumberOfLoginAttemps()  */
   int numberOfFailedLoginAttemps;

   /** @see getTerminalId()  */
   Long terminalId;

   /** @see #getHostName()  */
   String hostName;

   /** @see getEmailAddress()  */
   String emailAddress;

   /** @see getTelephoneNumber()  */
   String telephoneNumber;

   /** @see getMobileTelephoneNumber()  */
   String mobileTelephoneNumber;

   /** @see getGroups()  */
   @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users")
   List<ETrainGroup> groups;

   /** @see getLocale()  */
   String locale;

   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
   ETrainPassword password;

   protected ETrainUser() {
   }

   /**
    * @return the locale
    */
   public String getLocale() {
      return locale;
   }

   /**
    * @param locale
    *            the locale to set
    */
   public void setLocale(String locale) {
      this.locale = locale;
   }

   /**
    * @return the userName
    */
   public String getUserName() {
      return userName;
   }

   /**
    * @param userName
    *            the userName to set
    */
   public void setUserName(String userName) {
      this.userName = userName;
   }

   /**
    * @return the fullName
    */
   public String getFullName() {
      return fullName;
   }

   /**
    * @param fullName
    *            the fullName to set
    */
   public void setFullName(String fullName) {
      this.fullName = fullName;
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
    * @return the password
    */
   public ETrainPassword getPassword() {
      return password;
   }

   /**
    * @param password
    *            the password to set
    */
   public void setPassword(ETrainPassword password) {
      this.password = password;
   }

   /**
    * @return the locked
    */
   public boolean isLocked() {
      return locked;
   }

   /**
    * @param locked
    *            the locked to set
    */
   public void setLocked(boolean locked) {
      this.locked = locked;
   }

   /**
    * @return the passwordChangeable
    */
   public boolean isPasswordChangeable() {
      return passwordChangeable;
   }

   /**
    * @param passwordChangeable
    *            the passwordChangeable to set
    */
   public void setPasswordChangeable(boolean passwordChangeable) {
      this.passwordChangeable = passwordChangeable;
   }

   /**
    * @return the loggedOn
    */
   public boolean isLoggedOn() {
      return loggedOn;
   }

   /**
    * @param loggedOn
    *            the loggedOn to set
    */
   public void setLoggedOn(boolean loggedOn) {
      this.loggedOn = loggedOn;
   }

   /**
    * @return the timeOfLastLogin
    */
   public Date getTimeOfLastLogin() {
      return timeOfLastLogin;
   }

   /**
    * @param timeOfLastLogin
    *            the timeOfLastLogin to set
    */
   public void setTimeOfLastLogin(Date timeOfLastLogin) {
      this.timeOfLastLogin = timeOfLastLogin;
   }

   /**
    * @return the timeOfLastLogout
    */
   public Date getTimeOfLastLogout() {
      return timeOfLastLogout;
   }

   /**
    * @param timeOfLastLogout
    *            the timeOfLastLogout to set
    */
   public void setTimeOfLastLogout(Date timeOfLastLogout) {
      this.timeOfLastLogout = timeOfLastLogout;
   }

   /**
    * @return the numberOfLoginAttemps
    */
   public int getNumberOfFailedLoginAttemps() {
      return numberOfFailedLoginAttemps;
   }

   /**
    * @param numberOfLoginAttemps
    *            the numberOfLoginAttemps to set
    */
   public void setNumberOfFailedLoginAttemps(int numberOfLoginAttemps) {
      this.numberOfFailedLoginAttemps = numberOfLoginAttemps;
   }

   /**
    * @return the terminalId
    */
   public Long getTerminalId() {
      return terminalId;
   }

   /**
    * @param terminalId
    *            the terminalId to set
    */
   public void setTerminalId(Long terminalId) {
      this.terminalId = terminalId;
   }

   /**
    * @return the hostName
    */
   public String getHostName() {
      return hostName;
   }

   /**
    * @param hostName
    *            the hostName to set
    */
   public void setHostName(String hostName) {
      this.hostName = hostName;
   }

   /**
    * @return the emailAddress
    */
   public String getEmailAddress() {
      return emailAddress;
   }

   /**
    * @param emailAddress
    *            the emailAddress to set
    */
   public void setEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
   }

   /**
    * @return the telephoneNumber
    */
   public String getTelephoneNumber() {
      return telephoneNumber;
   }

   /**
    * @param telephoneNumber
    *            the telephoneNumber to set
    */
   public void setTelephoneNumber(String telephoneNumber) {
      this.telephoneNumber = telephoneNumber;
   }

   /**
    * @return the mobileTelephoneNumber
    */
   public String getMobileTelephoneNumber() {
      return mobileTelephoneNumber;
   }

   /**
    * @param mobileTelephoneNumber
    *            the mobileTelephoneNumber to set
    */
   public void setMobileTelephoneNumber(String mobileTelephoneNumber) {
      this.mobileTelephoneNumber = mobileTelephoneNumber;
   }

   /**
    * @return the groups
    */
   public List<ETrainGroup> getGroups() {
      return groups;
   }

   /**
    * @param groups
    *            the groups to set
    */
   public void setGroups(List<ETrainGroup> groups) {
      this.groups = groups;
   }
}
