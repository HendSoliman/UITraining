/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class is the DTO for the class com.dematic.trainingwarehouse.entity.ETrainPermission
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainPermissionDto extends com.dematic.wms.app.base.ui.shared.dto.AbstractEntityDto {
   private static final long serialVersionUID = 1L;

   protected ETrainPermissionDto() {
      super();
   }

   public void setPermissionName(java.lang.String permissionName) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(permissionName);
      setAttribute(ETrainPermissionDtoMetaData.PERMISSION_NAME, property);
   }

   public java.lang.String getPermissionName() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainPermissionDtoMetaData.PERMISSION_NAME)).getValue();
   }

   public void setDescription(java.lang.String description) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(description);
      setAttribute(ETrainPermissionDtoMetaData.DESCRIPTION, property);
   }

   public java.lang.String getDescription() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainPermissionDtoMetaData.DESCRIPTION)).getValue();
   }

   public void setAdminOnly(boolean adminOnly) {
      com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty property = new com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty();
      property.setValue(adminOnly);
      setAttribute(ETrainPermissionDtoMetaData.ADMIN_ONLY, property);
   }

   public boolean getAdminOnly() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.BooleanProperty) getAttribute(ETrainPermissionDtoMetaData.ADMIN_ONLY)).getValue();
   }


   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createMetaData() {
      return new ETrainPermissionDtoMetaData();
   }


   static public ETrainPermissionDto createInstance() {
      com.dematic.wms.app.base.ui.client.DtoCreator<ETrainPermissionDto> creator = com.google.gwt.core.client.GWT.create(ETrainPermissionDto.class);
      return creator.create();
   }

   static public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData metaData() {
      return createInstance().getMetaData();
   }

}
