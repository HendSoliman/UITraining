/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class offers meta data for the DTO class com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainUserDtoMetaData extends com.dematic.wms.app.base.ui.shared.dto.AbstractEntityDtoMetaData{

   protected static final java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> eTrainUserDtoMetaDataMap;
   public final static String USER_NAME = "userName";
   public final static String FULL_NAME = "fullName";
   public final static String DESCRIPTION = "description";
   public final static String LOCKED = "locked";
   public final static String PASSWORD_CHANGEABLE = "passwordChangeable";
   public final static String LOGGED_ON = "loggedOn";
   public final static String TIME_OF_LAST_LOGIN = "timeOfLastLogin";
   public final static String TIME_OF_LAST_LOGOUT = "timeOfLastLogout";
   public final static String NUMBER_OF_FAILED_LOGIN_ATTEMPS = "numberOfFailedLoginAttemps";
   public final static String TERMINAL_ID = "terminalId";
   public final static String HOST_NAME = "hostName";
   public final static String EMAIL_ADDRESS = "emailAddress";
   public final static String TELEPHONE_NUMBER = "telephoneNumber";
   public final static String MOBILE_TELEPHONE_NUMBER = "mobileTelephoneNumber";
   public final static String GROUPS = "groups";
   public final static String LOCALE = "locale";
   public final static String PASSWORD = "password";

   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData USER_NAME_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData FULL_NAME_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData DESCRIPTION_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData LOCKED_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData PASSWORD_CHANGEABLE_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData LOGGED_ON_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData TIME_OF_LAST_LOGIN_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData TIME_OF_LAST_LOGOUT_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData NUMBER_OF_FAILED_LOGIN_ATTEMPS_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData TERMINAL_ID_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData HOST_NAME_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData EMAIL_ADDRESS_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData TELEPHONE_NUMBER_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData MOBILE_TELEPHONE_NUMBER_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData GROUPS_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData LOCALE_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData PASSWORD_META_DATA;

   static {
      eTrainUserDtoMetaDataMap = new java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData>(abstractEntityDtoMetaDataMap);
      com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(0);
      metaData.setDatabaseColumnName("USER_NAME");
      eTrainUserDtoMetaDataMap.put(USER_NAME, metaData);
      USER_NAME_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("FULL_NAME");
      eTrainUserDtoMetaDataMap.put(FULL_NAME, metaData);
      FULL_NAME_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("DESCRIPTION");
      eTrainUserDtoMetaDataMap.put(DESCRIPTION, metaData);
      DESCRIPTION_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.BOOLEAN);
      metaData.setLength(0);
      metaData.setMandatory(true);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("LOCKED");
      eTrainUserDtoMetaDataMap.put(LOCKED, metaData);
      LOCKED_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.BOOLEAN);
      metaData.setLength(0);
      metaData.setMandatory(true);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("PASSWORD_CHANGEABLE");
      eTrainUserDtoMetaDataMap.put(PASSWORD_CHANGEABLE, metaData);
      PASSWORD_CHANGEABLE_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.BOOLEAN);
      metaData.setLength(0);
      metaData.setMandatory(true);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("LOGGED_ON");
      eTrainUserDtoMetaDataMap.put(LOGGED_ON, metaData);
      LOGGED_ON_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.DATE);
      metaData.setLength(0);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("TIME_OF_LAST_LOGIN");
      eTrainUserDtoMetaDataMap.put(TIME_OF_LAST_LOGIN, metaData);
      TIME_OF_LAST_LOGIN_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.DATE);
      metaData.setLength(0);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("TIME_OF_LAST_LOGOUT");
      eTrainUserDtoMetaDataMap.put(TIME_OF_LAST_LOGOUT, metaData);
      TIME_OF_LAST_LOGOUT_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.INTEGER);
      metaData.setLength(11);
      metaData.setMandatory(true);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("NUMBER_OF_FAILED_LOGIN_ATTEMPS");
      eTrainUserDtoMetaDataMap.put(NUMBER_OF_FAILED_LOGIN_ATTEMPS, metaData);
      NUMBER_OF_FAILED_LOGIN_ATTEMPS_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.LONG);
      metaData.setLength(20);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("TERMINAL_ID");
      eTrainUserDtoMetaDataMap.put(TERMINAL_ID, metaData);
      TERMINAL_ID_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("HOST_NAME");
      eTrainUserDtoMetaDataMap.put(HOST_NAME, metaData);
      HOST_NAME_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("EMAIL_ADDRESS");
      eTrainUserDtoMetaDataMap.put(EMAIL_ADDRESS, metaData);
      EMAIL_ADDRESS_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("TELEPHONE_NUMBER");
      eTrainUserDtoMetaDataMap.put(TELEPHONE_NUMBER, metaData);
      TELEPHONE_NUMBER_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("MOBILE_TELEPHONE_NUMBER");
      eTrainUserDtoMetaDataMap.put(MOBILE_TELEPHONE_NUMBER, metaData);
      MOBILE_TELEPHONE_NUMBER_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.COLLECTION);
      metaData.setLength(0);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setReferencedDtoMetaDataCreator(new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.DtoMetaDataCreator() {
      
         @Override
         public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createDtoMetaData() {
            return new com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDtoMetaData(){};
         }
      });
      metaData.setDatabaseColumnName("GROUPS");
      eTrainUserDtoMetaDataMap.put(GROUPS, metaData);
      GROUPS_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("LOCALE");
      eTrainUserDtoMetaDataMap.put(LOCALE, metaData);
      LOCALE_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.REFERENCE);
      metaData.setLength(0);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setReferencedDtoMetaDataCreator(new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.DtoMetaDataCreator() {
      
         @Override
         public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createDtoMetaData() {
            return new com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDtoMetaData(){};
         }
      });
      metaData.setDatabaseColumnName("PASSWORD");
      eTrainUserDtoMetaDataMap.put(PASSWORD, metaData);
      PASSWORD_META_DATA = metaData;
   }

   protected ETrainUserDtoMetaData() {
   }

   @Override
   protected java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> getMetaData() {
      return eTrainUserDtoMetaDataMap;
   }

   @Override
   public String getDtoClassName() {
      return "com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto";
   }

   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDto createNewDtoOnClient() {
      return ETrainUserDto.createInstance();
   }

   @Override
   public String getMapperClassName() {
      return "com.dematic.trainingwarehouse.ui.server.dto.ETrainUserDtoMapper";
   }

   @Override
   public String getTableName() {
      return "ETRAIN_USER";
   }

   @Override
   public String getAuditTrailTableName() {
      return "ETRAIN_USER_AUD";
   }

}
