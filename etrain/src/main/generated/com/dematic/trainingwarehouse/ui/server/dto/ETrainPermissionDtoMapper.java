/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.server.dto;

import com.dematic.wms.app.base.ui.server.dto.annotation.GeneratedDtoMapper;
import com.dematic.wms.app.tracing.Traceable;

/**
 * This class offers basic services to convert com.dematic.trainingwarehouse.entity.ETrainPermission objects into com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto DTO objects and vice versa
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */

@GeneratedDtoMapper()
@Traceable()
public class ETrainPermissionDtoMapper extends com.dematic.wms.app.base.ui.server.dto.AbstractEntityDtoMapper<com.dematic.trainingwarehouse.entity.ETrainPermission,com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto> {

   @Override
   public void fillEntityFromDto(com.dematic.trainingwarehouse.entity.ETrainPermission entity, com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto dto) {
   
      entity.setPermissionName((java.lang.String)convertDto2EntityData(dto.getPermissionName(), dto.getMetaData().getMetaData("permissionName")));
      entity.setDescription((java.lang.String)convertDto2EntityData(dto.getDescription(), dto.getMetaData().getMetaData("description")));
      entity.setAdminOnly((java.lang.Boolean)convertDto2EntityData(dto.getAdminOnly(), dto.getMetaData().getMetaData("adminOnly")));
      super.fillEntityFromDto(entity, dto);
   }

   @Override
   public void fillDtoFromEntity(com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto dto, com.dematic.trainingwarehouse.entity.ETrainPermission entity, boolean processReferences) {
   
      dto.setPermissionName((java.lang.String)convertEntityData2Dto(entity.getPermissionName(), dto.getMetaData().getMetaData("permissionName")));
      dto.setDescription((java.lang.String)convertEntityData2Dto(entity.getDescription(), dto.getMetaData().getMetaData("description")));
      dto.setAdminOnly((java.lang.Boolean)convertEntityData2Dto(entity.isAdminOnly(), dto.getMetaData().getMetaData("adminOnly")));
      super.fillDtoFromEntity(dto, entity, processReferences);
   }

   @Override
   protected Class<? extends com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto> getSpecificDtoClass() {
      return com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto.class;
   }

}
