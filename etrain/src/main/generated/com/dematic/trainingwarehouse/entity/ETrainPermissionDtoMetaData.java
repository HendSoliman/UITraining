/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto;

/**
 * This class offers meta data for the DTO class com.dematic.trainingwarehouse.entity.ETrainPermissionDto
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainPermissionDtoMetaData extends com.dematic.wms.app.base.ui.shared.dto.AbstractEntityDtoMetaData{

   protected static final java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> eTrainPermissionDtoMetaDataMap;
   public final static String PERMISSION_NAME = "permissionName";
   public final static String DESCRIPTION = "description";
   public final static String ADMIN_ONLY = "adminOnly";

   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData PERMISSION_NAME_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData DESCRIPTION_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData ADMIN_ONLY_META_DATA;

   static {
      eTrainPermissionDtoMetaDataMap = new java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData>(abstractEntityDtoMetaDataMap);
      com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(0);
      metaData.setDatabaseColumnName("PERMISSION_NAME");
      eTrainPermissionDtoMetaDataMap.put(PERMISSION_NAME, metaData);
      PERMISSION_NAME_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("DESCRIPTION");
      eTrainPermissionDtoMetaDataMap.put(DESCRIPTION, metaData);
      DESCRIPTION_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.BOOLEAN);
      metaData.setLength(0);
      metaData.setMandatory(true);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("ADMIN_ONLY");
      eTrainPermissionDtoMetaDataMap.put(ADMIN_ONLY, metaData);
      ADMIN_ONLY_META_DATA = metaData;
   }

   protected ETrainPermissionDtoMetaData() {
   }

   @Override
   protected java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> getMetaData() {
      return eTrainPermissionDtoMetaDataMap;
   }

   @Override
   public String getDtoClassName() {
      return "com.dematic.trainingwarehouse.entity.ETrainPermissionDto";
   }

   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDto createNewDtoOnClient() {
      return ETrainPermissionDto.createInstance();
   }

   @Override
   public String getMapperClassName() {
      return "com.dematic.trainingwarehouse.entity.ETrainPermissionDtoMapper";
   }

   @Override
   public String getTableName() {
      return "ETRAIN_PERMISSION";
   }

   @Override
   public String getAuditTrailTableName() {
      return "ETRAIN_PERMISSION_AUD";
   }

}
