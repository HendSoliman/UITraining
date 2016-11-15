/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.command;

import com.dematic.wms.app.base.ui.client.command.AbstractDtoCommandFactory;
import com.dematic.wms.app.base.ui.client.command.SCommand;
import com.dematic.wms.app.base.ui.client.dialog.DtoDetailDialog;
import com.dematic.trainingwarehouse.ui.client.dialog.ETrainGroupDetailDialog;
import com.dematic.trainingwarehouse.ui.client.service.ETrainGroupServiceAsync;
import com.dematic.trainingwarehouse.ui.client.service.ETrainGroupServiceFactory;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto;
import com.google.gwt.core.client.GWT;

/**
 * command factory for ETrainGroupDto
 * @author Hend Soliman
 */

public class ETrainGroupCommandFactory extends AbstractDtoCommandFactory<ETrainGroupDto, ETrainGroupServiceAsync> {

   private static ETrainGroupCommandFactory instance;
   public static final String ASSOCIATE_USER_TO_GROUP = "associateUserToGroup";

   private ETrainGroupCommandFactory() {
   }

   static public ETrainGroupCommandFactory getInstance() {

      if (instance == null) {
         instance = GWT.create(ETrainGroupCommandFactory.class);
      }

      return instance;
   }

   @Override
   protected DtoDetailDialog<ETrainGroupDto> createDetailDialog() {
      return GWT.create(ETrainGroupDetailDialog.class);
   }

   @Override
   public ETrainGroupDto getNewDtoInstance() {
      return ETrainGroupDto.createInstance();
   }

   @Override
   protected ETrainGroupServiceAsync getDtoService() {
      return ETrainGroupServiceFactory.getService();
   }
   @Override protected void init() {
      super.init();
    
      creators.put(ASSOCIATE_USER_TO_GROUP, new CommandCreator() {
         @Override
         public SCommand create() {
            return new AssociateUsersToGroupCommand();
         }
      });
   }
}
