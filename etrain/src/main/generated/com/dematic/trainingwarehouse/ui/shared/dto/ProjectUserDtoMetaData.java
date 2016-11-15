/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class offers meta data for the DTO class com.dematic.trainingwarehouse.ui.shared.dto.ProjectUserDto
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ProjectUserDtoMetaData extends com.dematic.wms.app.user.ui.shared.UserDtoMetaData{

   protected static final java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> projectUserDtoMetaDataMap;
   public final static String PROJECT_ATTRIBUTE = "projectAttribute";

   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData PROJECT_ATTRIBUTE_META_DATA;

   static {
      projectUserDtoMetaDataMap = new java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData>(userDtoMetaDataMap);
      com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("PROJECT_ATTRIBUTE");
      projectUserDtoMetaDataMap.put(PROJECT_ATTRIBUTE, metaData);
      PROJECT_ATTRIBUTE_META_DATA = metaData;
   }

   protected ProjectUserDtoMetaData() {
   }

   @Override
   protected java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> getMetaData() {
      return projectUserDtoMetaDataMap;
   }

   @Override
   public String getDtoClassName() {
      return "com.dematic.trainingwarehouse.ui.shared.dto.ProjectUserDto";
   }

   @Override
   public String getOverridenDtoClassName() {
      return "com.dematic.wms.app.user.ui.shared.UserDto";
   }

   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDto createNewDtoOnClient() {
      return ProjectUserDto.createInstance();
   }

   @Override
   public String getMapperClassName() {
      return "com.dematic.trainingwarehouse.ui.server.dto.ProjectUserDtoMapper";
   }

}
