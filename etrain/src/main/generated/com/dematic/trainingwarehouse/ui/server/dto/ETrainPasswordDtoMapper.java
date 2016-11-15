/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.server.dto;

import com.dematic.wms.app.base.ui.server.dto.annotation.GeneratedDtoMapper;
import com.dematic.wms.app.base.ui.server.dto.annotation.IgnoreAttributes;
import com.dematic.wms.app.tracing.Traceable;

/**
 * This class offers basic services to convert com.dematic.trainingwarehouse.entity.ETrainPassword objects into com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto DTO objects and vice versa
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */

@GeneratedDtoMapper()
@IgnoreAttributes(attributeNames={"encryptedValue"})
@Traceable()
public class ETrainPasswordDtoMapper extends com.dematic.wms.app.base.ui.server.dto.AbstractEntityDtoMapper<com.dematic.trainingwarehouse.entity.ETrainPassword,com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto> {

   @Override
   public void fillEntityFromDto(com.dematic.trainingwarehouse.entity.ETrainPassword entity, com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto dto) {
   
      entity.setPassword((java.lang.String)convertDto2EntityData(dto.getPassword(), dto.getMetaData().getMetaData("password")));
      super.fillEntityFromDto(entity, dto);
   }

   @Override
   public void fillDtoFromEntity(com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto dto, com.dematic.trainingwarehouse.entity.ETrainPassword entity, boolean processReferences) {
   
      dto.setPassword((java.lang.String)convertEntityData2Dto(entity.getPassword(), dto.getMetaData().getMetaData("password")));
      super.fillDtoFromEntity(dto, entity, processReferences);
   }

   @Override
   protected Class<? extends com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto> getSpecificDtoClass() {
      return com.dematic.trainingwarehouse.ui.shared.dto.ETrainPasswordDto.class;
   }

}
