package com.dematic.trainingwarehouse.ui.client.service;

import java.io.Serializable;

import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto;

public class AllPermissionsDeletedEvent implements Serializable {
   private static final long serialVersionUID = 1L;

   private ETrainGroupDto group;

   public ETrainGroupDto getGroup() {
      return group;
   }

   public void setGroup(ETrainGroupDto group) {
      this.group = group;
   }
}