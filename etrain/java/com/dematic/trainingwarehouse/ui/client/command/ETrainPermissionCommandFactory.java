/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.command;

import com.dematic.wms.app.base.ui.client.command.AbstractDtoCommandFactory;
import com.dematic.wms.app.base.ui.client.dialog.DtoDetailDialog;
import com.dematic.trainingwarehouse.ui.client.dialog.ETrainPermissionDetailDialog;
import com.dematic.trainingwarehouse.ui.client.service.ETrainPermissionServiceAsync;
import com.dematic.trainingwarehouse.ui.client.service.ETrainPermissionServiceFactory;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto;
import com.google.gwt.core.client.GWT;

/**
 * command factory for ETrainPermissionDto
 * @author Hend Soliman
 */

public class ETrainPermissionCommandFactory extends AbstractDtoCommandFactory<ETrainPermissionDto, ETrainPermissionServiceAsync> {

   private static ETrainPermissionCommandFactory instance;

   private ETrainPermissionCommandFactory() {
   }

   static public ETrainPermissionCommandFactory getInstance() {

      if (instance == null) {

         instance = GWT.create(ETrainPermissionCommandFactory.class);

      }

      return instance;

   }

   @Override
   protected DtoDetailDialog<ETrainPermissionDto> createDetailDialog() {

      return GWT.create(ETrainPermissionDetailDialog.class);

   }

   @Override
   public ETrainPermissionDto getNewDtoInstance() {

      return ETrainPermissionDto.createInstance();

   }

   @Override
   protected ETrainPermissionServiceAsync getDtoService() {

      return ETrainPermissionServiceFactory.getService();

   }

   @Override
   protected void init() {
      super.init();
      creators.remove(DUPLICATE);
   }
}