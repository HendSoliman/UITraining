/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class offers meta data for the DTO class com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainGroupDtoMetaData extends com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupBaseDtoMetaData{

   protected static final java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> eTrainGroupDtoMetaDataMap;
   public final static String GROUP_NAME = "groupName";
   public final static String DESCRIPTION = "description";
   public final static String PARENT = "parent";
   public final static String CHILDREN = "children";
   public final static String PERMISSIONS = "permissions";
   public final static String USERS = "users";

   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData GROUP_NAME_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData DESCRIPTION_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData PARENT_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData CHILDREN_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData PERMISSIONS_META_DATA;
   public final static com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData USERS_META_DATA;

   static {
      eTrainGroupDtoMetaDataMap = new java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData>(eTrainGroupBaseDtoMetaDataMap);
      com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(255);
      metaData.setMandatory(false);
      metaData.setLogicalId(0);
      metaData.setDatabaseColumnName("GROUP_NAME");
      eTrainGroupDtoMetaDataMap.put(GROUP_NAME, metaData);
      GROUP_NAME_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.STRING);
      metaData.setLength(20);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setDatabaseColumnName("DESCRIPTION");
      eTrainGroupDtoMetaDataMap.put(DESCRIPTION, metaData);
      DESCRIPTION_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.REFERENCE);
      metaData.setLength(0);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setReferencedDtoMetaDataCreator(new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.DtoMetaDataCreator() {
      
         @Override
         public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createDtoMetaData() {
            return new com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDtoMetaData(){};
         }
      });
      metaData.setDatabaseColumnName("ETRAIN_PARENT_GROUP_NAME");
      eTrainGroupDtoMetaDataMap.put(PARENT, metaData);
      PARENT_META_DATA = metaData;

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
      com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.CollectionAccess collectionAccess;
      collectionAccess = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.CollectionAccess();
      collectionAccess.setMappedByAttributeName("parent");
      metaData.setCollectionAccess(collectionAccess);
      eTrainGroupDtoMetaDataMap.put(CHILDREN, metaData);
      CHILDREN_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.COLLECTION);
      metaData.setLength(0);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setReferencedDtoMetaDataCreator(new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.DtoMetaDataCreator() {
      
         @Override
         public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createDtoMetaData() {
            return new com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDtoMetaData(){};
         }
      });
      collectionAccess = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.CollectionAccess();
      collectionAccess.setCollectionPrimaryKeyColumnName("ETRAIN_GROUP");
      metaData.setCollectionAccess(collectionAccess);
      eTrainGroupDtoMetaDataMap.put(PERMISSIONS, metaData);
      PERMISSIONS_META_DATA = metaData;

      metaData = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData();
      metaData.setType(com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.Type.COLLECTION);
      metaData.setLength(0);
      metaData.setMandatory(false);
      metaData.setLogicalId(-1);
      metaData.setReferencedDtoMetaDataCreator(new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.DtoMetaDataCreator() {
      
         @Override
         public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createDtoMetaData() {
            return new com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDtoMetaData(){};
         }
      });
      collectionAccess = new com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData.CollectionAccess();
      collectionAccess.setJoinTableName("ETRAIN_USER_GROUPS");
      collectionAccess.setMyPrimaryKeyColumnName("GROUPNAME");
      collectionAccess.setCollectionPrimaryKeyColumnName("USERNAME");
      metaData.setCollectionAccess(collectionAccess);
      eTrainGroupDtoMetaDataMap.put(USERS, metaData);
      USERS_META_DATA = metaData;
   }

   protected ETrainGroupDtoMetaData() {
   }

   @Override
   protected java.util.HashMap<String, com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData.MetaData> getMetaData() {
      return eTrainGroupDtoMetaDataMap;
   }

   @Override
   public String getDtoClassName() {
      return "com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto";
   }

   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDto createNewDtoOnClient() {
      return ETrainGroupDto.createInstance();
   }

   @Override
   public String getMapperClassName() {
      return "com.dematic.trainingwarehouse.ui.server.dto.ETrainGroupDtoMapper";
   }

   @Override
   public String getTableName() {
      return "ETRAIN_GROUP";
   }

   @Override
   public String getAuditTrailTableName() {
      return "ETRAIN_GROUP_AUD";
   }

}
