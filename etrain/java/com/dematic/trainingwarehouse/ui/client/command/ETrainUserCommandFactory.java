/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.command;

import com.dematic.trainingwarehouse.ui.client.dialog.ETrainUserDetailDialog;
import com.dematic.trainingwarehouse.ui.client.service.ETrainUserServiceAsync;
import com.dematic.trainingwarehouse.ui.client.service.ETrainUserServiceFactory;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto;
import com.dematic.wms.app.base.ui.client.command.AbstractDtoCommandFactory;
import com.dematic.wms.app.base.ui.client.command.SCommand;
import com.dematic.wms.app.base.ui.client.dialog.DtoDetailDialog;
import com.google.gwt.core.client.GWT;

/**
 * command factory for ETrainUserDto
 * @author Hend Soliman
 */

public class ETrainUserCommandFactory extends AbstractDtoCommandFactory<ETrainUserDto, ETrainUserServiceAsync> {

   public static final String NAVIGATE_TO_USER = "navigateToUser";

   private static ETrainUserCommandFactory instance;

   private ETrainUserCommandFactory() {
   }

   static public ETrainUserCommandFactory getInstance() {

      if (instance == null) {
         instance = GWT.create(ETrainUserCommandFactory.class);
      }

      return instance;
   }

   @Override
   protected DtoDetailDialog<ETrainUserDto> createDetailDialog() {
      return GWT.create(ETrainUserDetailDialog.class);
   }

   @Override
   public ETrainUserDto getNewDtoInstance() {
      return ETrainUserDto.createInstance();
   }

   @Override
   protected ETrainUserServiceAsync getDtoService() {
      return ETrainUserServiceFactory.getService();
   }

   @Override
   protected void init() {

      super.init();

      creators.put(NAVIGATE_TO_USER, new CommandCreator() {

         @Override
         public SCommand create() {

            return new ETrainUserNavigationCommand();

         }

      });
   }
}