/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class offers meta data for the DTO class com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainPasswordDtoMetaData extends com.dematic.wms.app.base.ui.shared.dto.AbstractEntityDtoMetaData{

   protected static final java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> eTrainPasswordDtoMetaDataMap;
   public final static String PASSWORD = "password";

   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData PASSWORD_META_DATA;

   static {
      eTrainPasswordDtoMetaDataMap = new java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData>(abstractEntityDtoMetaDataMap);
      com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("PASSWORD");
      eTrainPasswordDtoMetaDataMap.put(PASSWORD, metaData);
      PASSWORD_META_DATA = metaData;
   }

   protected ETrainPasswordDtoMetaData() {
   }

   @Override
   protected java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> getMetaData() {
      return eTrainPasswordDtoMetaDataMap;
   }

   @Override
   public String getDtoClassName() {
      return "com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto";
   }

   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDto createNewDtoOnClient() {
      return ETrainPasswordDto.createInstance();
   }

   @Override
   public String getMapperClassName() {
      return "com.dematic.trainingwarehouse.ui.server.dto.ETrainPasswordDtoMapper";
   }

   @Override
   public String getTableName() {
      return "ETRAIN_PASSWORD";
   }

   @Override
   public String getAuditTrailTableName() {
      return "ETRAIN_PASSWORD_AUD";
   }

}
