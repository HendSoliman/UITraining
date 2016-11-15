/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.server.dto;

import com.dematic.wms.app.base.ui.server.dto.annotation.GeneratedDtoMapper;
import com.dematic.wms.app.tracing.Traceable;

/**
 * This class offers basic services to convert com.dematic.trainingwarehouse.entity.ETrainGroup objects into com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto DTO objects and vice versa
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */

@GeneratedDtoMapper()
@Traceable()
public class ETrainGroupDtoMapper extends com.dematic.trainingwarehouse.ui.server.dto.ETrainGroupBaseDtoMapper {

   @Override
   public void fillEntityFromDto(com.dematic.trainingwarehouse.entity.ETrainGroup entity, com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto dto) {
   
      entity.setGroupName((java.lang.String)convertDto2EntityData(dto.getGroupName(), dto.getMetaData().getMetaData("groupName")));
      entity.setDescription((java.lang.String)convertDto2EntityData(dto.getDescription(), dto.getMetaData().getMetaData("description")));
      entity.setParent(dtoMapperFactory.create(com.dematic.trainingwarehouse.ui.server.dto.ETrainGroupDtoMapper.class).mapDto2Entity(dto.getParent()));
      super.fillEntityFromDto(entity, dto);
   }

   @Override
   public void fillDtoFromEntity(com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto dto, com.dematic.trainingwarehouse.entity.ETrainGroup entity, boolean processReferences) {
   
      dto.setGroupName((java.lang.String)convertEntityData2Dto(entity.getGroupName(), dto.getMetaData().getMetaData("groupName")));
      dto.setDescription((java.lang.String)convertEntityData2Dto(entity.getDescription(), dto.getMetaData().getMetaData("description")));
      if (processReferences) dto.setParent(dtoMapperFactory.create(com.dematic.trainingwarehouse.ui.server.dto.ETrainGroupDtoMapper.class).mapEntity2DtoWithoutReferences(entity.getParent()));
      super.fillDtoFromEntity(dto, entity, processReferences);
   }

   @Override
   protected Class<? extends com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto> getSpecificDtoClass() {
      return com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto.class;
   }

}
