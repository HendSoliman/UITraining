/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.shared.dto;

/**
 * This class is the DTO for the class com.dematic.trainingwarehouse.entity.ProjectUser
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */
@com.dematic.wms.app.base.ui.client.common.OverrideDefaultImplementation
public class ProjectUserDto extends com.dematic.wms.app.user.ui.shared.UserDto {
   private static final long serialVersionUID = 1L;

   protected ProjectUserDto() {
      super();
   }

   public void setProjectAttribute(java.lang.String projectAttribute) {
      com.dematic.wms.app.base.ui.shared.data.common.StringProperty property = new com.dematic.wms.app.base.ui.shared.data.common.StringProperty();
      property.setValue(projectAttribute);
      setAttribute(ProjectUserDtoMetaData.PROJECT_ATTRIBUTE, property);
   }

   public java.lang.String getProjectAttribute() {
      return ((com.dematic.wms.app.base.ui.shared.data.common.StringProperty) getAttribute(ProjectUserDtoMetaData.PROJECT_ATTRIBUTE)).getValue();
   }


   @Override
   protected com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData createMetaData() {
      return new ProjectUserDtoMetaData();
   }


   static public ProjectUserDto createInstance() {
      com.dematic.wms.app.base.ui.client.DtoCreator<ProjectUserDto> creator = com.google.gwt.core.client.GWT.create(ProjectUserDto.class);
      return creator.create();
   }

   static public com.dematic.wms.app.base.ui.shared.dto.AbstractDtoMetaData metaData() {
      return createInstance().getMetaData();
   }

}
