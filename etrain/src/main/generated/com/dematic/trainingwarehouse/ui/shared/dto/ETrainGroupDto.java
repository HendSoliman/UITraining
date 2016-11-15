/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class is the DTO for the class com.dematic.trainingwarehouse.entity.ETrainGroup
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainGroupDto extends com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupBaseDto {
   private static final long serialVersionUID = 1L;

   protected ETrainGroupDto() {
      super();
   }

   public void setGroupName(java.lang.String groupName) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(groupName);
      setAttribute(ETrainGroupDtoMetaData.GROUP_NAME, property);
   }

   public java.lang.String getGroupName() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainGroupDtoMetaData.GROUP_NAME)).getValue();
   }

   public void setDescription(java.lang.String description) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(description);
      setAttribute(ETrainGroupDtoMetaData.DESCRIPTION, property);
   }

   public java.lang.String getDescription() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainGroupDtoMetaData.DESCRIPTION)).getValue();
   }

   public void setParent(com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto parent) {
      com.dematic.wms.app.base.ui.shared.data.DtoProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto> property = new com.dematic.wms.app.base.ui.shared.data.DtoProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto>();
      property.setValue(parent);
      setAttribute(ETrainGroupDtoMetaData.PARENT, property);
   }

   public com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto getParent() {
      return ((com.dematic.wms.app.base.ui.shared.data.DtoProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto>) getAttribute(ETrainGroupDtoMetaData.PARENT)).getValue();
   }

   public void setChildren(java.util.ArrayList<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto> children) {
      com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto> property = new com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto>();
      property.setValue(children);
      setAttribute(ETrainGroupDtoMetaData.CHILDREN, property);
   }

   public java.util.ArrayList<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto> getChildren() {
      return ((com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto>) getAttribute(ETrainGroupDtoMetaData.CHILDREN)).getValue();
   }

   public void setPermissions(java.util.ArrayList<com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto> permissions) {
      com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto> property = new com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto>();
      property.setValue(permissions);
      setAttribute(ETrainGroupDtoMetaData.PERMISSIONS, property);
   }

   public java.util.ArrayList<com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto> getPermissions() {
      return ((com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto>) getAttribute(ETrainGroupDtoMetaData.PERMISSIONS)).getValue();
   }

   public void setUsers(java.util.ArrayList<com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto> users) {
      com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto> property = new com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto>();
      property.setValue(users);
      setAttribute(ETrainGroupDtoMetaData.USERS, property);
   }

   public java.util.ArrayList<com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto> getUsers() {
      return ((com.dematic.wms.app.base.ui.shared.data.CollectionProperty<com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto>) getAttribute(ETrainGroupDtoMetaData.USERS)).getValue();
   }


   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createMetaData() {
      return new ETrainGroupDtoMetaData();
   }


   static public ETrainGroupDto createInstance() {
      com.dematic.wms.app.base.ui.client.DtoCreator<ETrainGroupDto> creator = com.google.gwt.core.client.GWT.create(ETrainGroupDto.class);
      return creator.create();
   }

   static public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData metaData() {
      return createInstance().getMetaData();
   }

}
