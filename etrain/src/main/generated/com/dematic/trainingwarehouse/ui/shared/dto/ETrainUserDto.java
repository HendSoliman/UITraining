/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class is the DTO for the class com.dematic.trainingwarehouse.entity.ETrainUser
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainUserDto extends com.dematic.wms.app.base.ui.shared.dto.AbstractEntityDto {
   private static final long serialVersionUID = 1L;

   protected ETrainUserDto() {
      super();
   }

   public void setUserName(java.lang.String userName) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(userName);
      setAttribute(ETrainUserDtoMetaData.USER_NAME, property);
   }

   public java.lang.String getUserName() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainUserDtoMetaData.USER_NAME)).getValue();
   }

   public void setFullName(java.lang.String fullName) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(fullName);
      setAttribute(ETrainUserDtoMetaData.FULL_NAME, property);
   }

   public java.lang.String getFullName() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainUserDtoMetaData.FULL_NAME)).getValue();
   }

   public void setDescription(java.lang.String description) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(description);
      setAttribute(ETrainUserDtoMetaData.DESCRIPTION, property);
   }

   public java.lang.String getDescription() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainUserDtoMetaData.DESCRIPTION)).getValue();
   }

   public void setLocked(boolean locked) {
      com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty property = new com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty();
      property.setValue(locked);
      setAttribute(ETrainUserDtoMetaData.LOCKED, property);
   }

   public boolean getLocked() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty) getAttribute(ETrainUserDtoMetaData.LOCKED)).getValue();
   }

   public void setPasswordChangeable(boolean passwordChangeable) {
      com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty property = new com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty();
      property.setValue(passwordChangeable);
      setAttribute(ETrainUserDtoMetaData.PASSWORD_CHANGEABLE, property);
   }

   public boolean getPasswordChangeable() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty) getAttribute(ETrainUserDtoMetaData.PASSWORD_CHANGEABLE)).getValue();
   }

   public void setLoggedOn(boolean loggedOn) {
      com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty property = new com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty();
      property.setValue(loggedOn);
      setAttribute(ETrainUserDtoMetaData.LOGGED_ON, property);
   }

   public boolean getLoggedOn() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty) getAttribute(ETrainUserDtoMetaData.LOGGED_ON)).getValue();
   }

   public void setTimeOfLastLogin(java.util.Date timeOfLastLogin) {
      com.dematic.wms.app.base.ui.shared.data.common.DateProperty property = new com.dematic.wms.app.base.ui.shared.data.common.DateProperty();
      property.setValue(timeOfLastLogin);
      setAttribute(ETrainUserDtoMetaData.TIME_OF_LAST_LOGIN, property);
   }

   public java.util.Date getTimeOfLastLogin() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.DateProperty) getAttribute(ETrainUserDtoMetaData.TIME_OF_LAST_LOGIN)).getValue();
   }

   public void setTimeOfLastLogout(java.util.Date timeOfLastLogout) {
      com.dematic.wms.app.base.ui.shared.data.common.DateProperty property = new com.dematic.wms.app.base.ui.shared.data.common.DateProperty();
      property.setValue(timeOfLastLogout);
      setAttribute(ETrainUserDtoMetaData.TIME_OF_LAST_LOGOUT, property);
   }

   public java.util.Date getTimeOfLastLogout() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.DateProperty) getAttribute(ETrainUserDtoMetaData.TIME_OF_LAST_LOGOUT)).getValue();
   }

   public void setNumberOfFailedLoginAttemps(int numberOfFailedLoginAttemps) {
      com.dematic.wms.app.base.ui.shared.data.common.IntegerProperty property = new com.dematic.wms.app.base.ui.shared.data.common.IntegerProperty();
      property.setValue(numberOfFailedLoginAttemps);
      setAttribute(ETrainUserDtoMetaData.NUMBER_OF_FAILED_LOGIN_ATTEMPS, property);
   }

   public int getNumberOfFailedLoginAttemps() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.IntegerProperty) getAttribute(ETrainUserDtoMetaData.NUMBER_OF_FAILED_LOGIN_ATTEMPS)).getValue();
   }

   public void setTerminalId(java.lang.Long terminalId) {
      com.dematic.wms.app.base.ui.shared.data.common.LongProperty property = new com.dematic.wms.app.base.ui.shared.data.common.LongProperty();
      property.setValue(terminalId);
      setAttribute(ETrainUserDtoMetaData.TERMINAL_ID, property);
   }

   public java.lang.Long getTerminalId() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.LongProperty) getAttribute(ETrainUserDtoMetaData.TERMINAL_ID)).getValue();
   }

   public void setHostName(java.lang.String hostName) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(hostName);
      setAttribute(ETrainUserDtoMetaData.HOST_NAME, property);
   }

   public java.lang.String getHostName() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainUserDtoMetaData.HOST_NAME)).getValue();
   }

   public void setEmailAddress(java.lang.String emailAddress) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(emailAddress);
      setAttribute(ETrainUserDtoMetaData.EMAIL_ADDRESS, property);
   }

   public java.lang.String getEmailAddress() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainUserDtoMetaData.EMAIL_ADDRESS)).getValue();
   }

   public void setTelephoneNumber(java.lang.String telephoneNumber) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(telephoneNumber);
      setAttribute(ETrainUserDtoMetaData.TELEPHONE_NUMBER, property);
   }

   public java.lang.String getTelephoneNumber() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainUserDtoMetaData.TELEPHONE_NUMBER)).getValue();
   }

   public void setMobileTelephoneNumber(java.lang.String mobileTelephoneNumber) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(mobileTelephoneNumber);
      setAttribute(ETrainUserDtoMetaData.MOBILE_TELEPHONE_NUMBER, property);
   }

   public java.lang.String getMobileTelephoneNumber() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainUserDtoMetaData.MOBILE_TELEPHONE_NUMBER)).getValue();
   }

   public void setGroups(java.util.ArrayList<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto> groups) {
      com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto> property = new com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto>();
      property.setValue(groups);
      setAttribute(ETrainUserDtoMetaData.GROUPS, property);
   }

   public java.util.ArrayList<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto> getGroups() {
      return ((com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto>) getAttribute(ETrainUserDtoMetaData.GROUPS)).getValue();
   }

   public void setLocale(java.lang.String locale) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(locale);
      setAttribute(ETrainUserDtoMetaData.LOCALE, property);
   }

   public java.lang.String getLocale() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainUserDtoMetaData.LOCALE)).getValue();
   }

   public void setPassword(com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto password) {
      com.dematic.wms.app.base.ui.shared.data.DtoProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto> property = new com.dematic.wms.app.base.ui.shared.data.DtoProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto>();
      property.setValue(password);
      setAttribute(ETrainUserDtoMetaData.PASSWORD, property);
   }

   public com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto getPassword() {
      return ((com.dematic.wms.app.base.ui.shared.data.DtoProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto>) getAttribute(ETrainUserDtoMetaData.PASSWORD)).getValue();
   }


   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createMetaData() {
      return new ETrainUserDtoMetaData();
   }


   static public ETrainUserDto createInstance() {
      com.dematic.wms.app.base.ui.client.DtoCreator<ETrainUserDto> creator = com.google.gwt.core.client.GWT.create(ETrainUserDto.class);
      return creator.create();
   }

   static public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData metaData() {
      return createInstance().getMetaData();
   }

}
