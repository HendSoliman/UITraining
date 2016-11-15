/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

import com.dematic.wms.app.base.ui.shared.dto.AbstractEntityDtoMetaData;

/**
 * This class offers meta data for the DTO class com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupBaseDto
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainGroupBaseDtoMetaData extends AbstractEntityDtoMetaData{

   protected static final java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> eTrainGroupBaseDtoMetaDataMap;
   public final static String PERMISSION_COUNT = "permissionCount";

   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData PERMISSION_COUNT_META_DATA;

   static {
      eTrainGroupBaseDtoMetaDataMap = new java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData>(abstractEntityDtoMetaDataMap);
      com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.INTEGER);
      metaData.setLength(11);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      eTrainGroupBaseDtoMetaDataMap.put(PERMISSION_COUNT, metaData);
      PERMISSION_COUNT_META_DATA = metaData;
   }

   protected ETrainGroupBaseDtoMetaData() {
   }

   @Override
   protected java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> getMetaData() {
      return eTrainGroupBaseDtoMetaDataMap;
   }

   @Override
   public String getDtoClassName() {
      return "com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupBaseDto";
   }

   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDto createNewDtoOnClient() {
      return ETrainGroupBaseDto.createInstance();
   }

   @Override
   public String getMapperClassName() {
      return "no.mapper.available";
   }

}
