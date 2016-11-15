/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class is the DTO for the class com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupBaseDto
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainGroupBaseDto extends com.dematic.wms.app.base.ui.shared.dto.AbstractEntityDto {
   private static final long serialVersionUID = 1L;

   protected ETrainGroupBaseDto() {
      super();
   }

   public void setPermissionCount(int permissionCount) {
      com.dematic.wms.app.base.ui.shared.data.common.IntegerProperty property = new com.dematic.wms.app.base.ui.shared.data.common.IntegerProperty();
      property.setValue(permissionCount);
      setAttribute(ETrainGroupBaseDtoMetaData.PERMISSION_COUNT, property);
   }

   public int getPermissionCount() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.IntegerProperty) getAttribute(ETrainGroupBaseDtoMetaData.PERMISSION_COUNT)).getValue();
   }


   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createMetaData() {
      return new ETrainGroupBaseDtoMetaData();
   }


   static public ETrainGroupBaseDto createInstance() {
      com.dematic.wms.app.base.ui.client.DtoCreator<ETrainGroupBaseDto> creator = com.google.gwt.core.client.GWT.create(ETrainGroupBaseDto.class);
      return creator.create();
   }

   static public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData metaData() {
      return createInstance().getMetaData();
   }

}
