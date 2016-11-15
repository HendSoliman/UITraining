/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class is the DTO for the class com.dematic.trainingwarehouse.entity.ETrainPassword
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
public class ETrainPasswordDto extends com.dematic.wms.app.base.ui.shared.dto.AbstractEntityDto {
   private static final long serialVersionUID = 1L;

   protected ETrainPasswordDto() {
      super();
   }

   public void setPassword(java.lang.String password) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(password);
      setAttribute(ETrainPasswordDtoMetaData.PASSWORD, property);
   }

   public java.lang.String getPassword() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ETrainPasswordDtoMetaData.PASSWORD)).getValue();
   }


   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createMetaData() {
      return new ETrainPasswordDtoMetaData();
   }


   static public ETrainPasswordDto createInstance() {
      com.dematic.wms.app.base.ui.client.DtoCreator<ETrainPasswordDto> creator = com.google.gwt.core.client.GWT.create(ETrainPasswordDto.class);
      return creator.create();
   }

   static public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData metaData() {
      return createInstance().getMetaData();
   }

}
