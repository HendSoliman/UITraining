/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.server.dto;

import com.dematic.wms.app.base.ui.server.dto.annotation.GeneratedDtoMapper;
import com.dematic.wms.app.base.ui.server.dto.annotation.SubstituteDto;
import com.dematic.wms.app.tracing.Traceable;
import javax.enterprise.inject.Specializes;

/**
 * This class offers basic services to convert com.dematic.trainingwarehouse.entity.ProjectUser objects into com.dematic.trainingwarehouse.ui.shared.dto.ProjectUserDto DTO objects and vice versa
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */

@GeneratedDtoMapper()
@SubstituteDto(withDto=com.dematic.trainingwarehouse.ui.shared.dto.ProjectUserDto.class,withEntity=com.dematic.trainingwarehouse.entity.ProjectUser.class)
@Traceable()
@Specializes()
public class ProjectUserDtoMapper extends com.dematic.wms.app.user.ui.server.dto.UserDtoMapper {

   @Override
   public void fillEntityFromDto(com.dematic.wms.app.user.entity.User entity, com.dematic.wms.app.user.ui.shared.UserDto dto) {
   
      com.dematic.trainingwarehouse.ui.shared.dto.ProjectUserDto specificDto = (com.dematic.trainingwarehouse.ui.shared.dto.ProjectUserDto)dto;
      com.dematic.trainingwarehouse.entity.ProjectUser specificEntity = com.dematic.wms.app.base.util.jpa.JpaUtils.cast(entity);
      specificEntity.setProjectAttribute((java.lang.String)convertDto2EntityData(specificDto.getProjectAttribute(), dto.getMetaData().getMetaData("projectAttribute")));
      super.fillEntityFromDto(entity, dto);
   }

   @Override
   public void fillDtoFromEntity(com.dematic.wms.app.user.ui.shared.UserDto dto, com.dematic.wms.app.user.entity.User entity, boolean processReferences) {
   
      com.dematic.trainingwarehouse.ui.shared.dto.ProjectUserDto specificDto = (com.dematic.trainingwarehouse.ui.shared.dto.ProjectUserDto)dto;
      com.dematic.trainingwarehouse.entity.ProjectUser specificEntity = com.dematic.wms.app.base.util.jpa.JpaUtils.cast(entity);
      specificDto.setProjectAttribute((java.lang.String)convertEntityData2Dto(specificEntity.getProjectAttribute(), dto.getMetaData().getMetaData("projectAttribute")));
      super.fillDtoFromEntity(dto, entity, processReferences);
   }

   @Override
   protected Class<? extends com.dematic.wms.app.user.ui.shared.UserDto> getSpecificDtoClass() {
      return com.dematic.trainingwarehouse.ui.shared.dto.ProjectUserDto.class;
   }

}
