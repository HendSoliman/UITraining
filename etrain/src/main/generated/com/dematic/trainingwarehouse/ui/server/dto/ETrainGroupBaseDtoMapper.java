package com.dematic.trainingwarehouse.ui.server.dto;

import java.util.List;

import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.trainingwarehouse.entity.ETrainPermission;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto;
import com.dematic.wms.app.base.ui.server.dto.AbstractEntityDtoMapper;

public abstract class ETrainGroupBaseDtoMapper extends AbstractEntityDtoMapper<ETrainGroup, ETrainGroupDto> {

   @Override
   public void fillDtoFromEntity(ETrainGroupDto dto, ETrainGroup entity, boolean processReferences) {

      List<ETrainPermission> permissions = entity.getPermissions();

      dto.setPermissionCount(permissions == null ? 0 : permissions.size());

      super.fillDtoFromEntity(dto, entity, processReferences);

   }

}