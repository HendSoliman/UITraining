/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.server.dto;

import com.dematic.wms.app.base.ui.server.dto.annotation.GeneratedDtoMapper;
import com.dematic.wms.app.tracing.Traceable;

/**
 * This class offers basic services to convert com.dematic.trainingwarehouse.entity.ETrainUser objects into com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto DTO objects and vice versa
 * This is generated code.
 * Do not modify unless you replace the GeneratedDtoMapper annotation 
 * with the ManualDtoMapper annotation
 * @author com.dematic.wms.app.base.ui.server.dto.DtoMapperGenerator
 */

@GeneratedDtoMapper()
@Traceable()
public class ETrainUserDtoMapper extends com.dematic.wms.app.base.ui.server.dto.AbstractEntityDtoMapper<com.dematic.trainingwarehouse.entity.ETrainUser,com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto> {

   @Override
   public void fillEntityFromDto(com.dematic.trainingwarehouse.entity.ETrainUser entity, com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto dto) {
   
      entity.setUserName((java.lang.String)convertDto2EntityData(dto.getUserName(), dto.getMetaData().getMetaData("userName")));
      entity.setFullName((java.lang.String)convertDto2EntityData(dto.getFullName(), dto.getMetaData().getMetaData("fullName")));
      entity.setDescription((java.lang.String)convertDto2EntityData(dto.getDescription(), dto.getMetaData().getMetaData("description")));
      entity.setLocked((java.lang.Boolean)convertDto2EntityData(dto.getLocked(), dto.getMetaData().getMetaData("locked")));
      entity.setPasswordChangeable((java.lang.Boolean)convertDto2EntityData(dto.getPasswordChangeable(), dto.getMetaData().getMetaData("passwordChangeable")));
      entity.setLoggedOn((java.lang.Boolean)convertDto2EntityData(dto.getLoggedOn(), dto.getMetaData().getMetaData("loggedOn")));
      entity.setTimeOfLastLogin((java.util.Date)convertDto2EntityData(dto.getTimeOfLastLogin(), dto.getMetaData().getMetaData("timeOfLastLogin")));
      entity.setTimeOfLastLogout((java.util.Date)convertDto2EntityData(dto.getTimeOfLastLogout(), dto.getMetaData().getMetaData("timeOfLastLogout")));
      entity.setNumberOfFailedLoginAttemps((java.lang.Integer)convertDto2EntityData(dto.getNumberOfFailedLoginAttemps(), dto.getMetaData().getMetaData("numberOfFailedLoginAttemps")));
      entity.setTerminalId((java.lang.Long)convertDto2EntityData(dto.getTerminalId(), dto.getMetaData().getMetaData("terminalId")));
      entity.setHostName((java.lang.String)convertDto2EntityData(dto.getHostName(), dto.getMetaData().getMetaData("hostName")));
      entity.setEmailAddress((java.lang.String)convertDto2EntityData(dto.getEmailAddress(), dto.getMetaData().getMetaData("emailAddress")));
      entity.setTelephoneNumber((java.lang.String)convertDto2EntityData(dto.getTelephoneNumber(), dto.getMetaData().getMetaData("telephoneNumber")));
      entity.setMobileTelephoneNumber((java.lang.String)convertDto2EntityData(dto.getMobileTelephoneNumber(), dto.getMetaData().getMetaData("mobileTelephoneNumber")));
      entity.setLocale((java.lang.String)convertDto2EntityData(dto.getLocale(), dto.getMetaData().getMetaData("locale")));
      entity.setPassword(dtoMapperFactory.create(com.dematic.trainingwarehouse.ui.server.dto.ETrainPasswordDtoMapper.class).mapDto2Entity(dto.getPassword()));
      super.fillEntityFromDto(entity, dto);
   }

   @Override
   public void fillDtoFromEntity(com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto dto, com.dematic.trainingwarehouse.entity.ETrainUser entity, boolean processReferences) {
   
      dto.setUserName((java.lang.String)convertEntityData2Dto(entity.getUserName(), dto.getMetaData().getMetaData("userName")));
      dto.setFullName((java.lang.String)convertEntityData2Dto(entity.getFullName(), dto.getMetaData().getMetaData("fullName")));
      dto.setDescription((java.lang.String)convertEntityData2Dto(entity.getDescription(), dto.getMetaData().getMetaData("description")));
      dto.setLocked((java.lang.Boolean)convertEntityData2Dto(entity.isLocked(), dto.getMetaData().getMetaData("locked")));
      dto.setPasswordChangeable((java.lang.Boolean)convertEntityData2Dto(entity.isPasswordChangeable(), dto.getMetaData().getMetaData("passwordChangeable")));
      dto.setLoggedOn((java.lang.Boolean)convertEntityData2Dto(entity.isLoggedOn(), dto.getMetaData().getMetaData("loggedOn")));
      dto.setTimeOfLastLogin((java.util.Date)convertEntityData2Dto(entity.getTimeOfLastLogin(), dto.getMetaData().getMetaData("timeOfLastLogin")));
      dto.setTimeOfLastLogout((java.util.Date)convertEntityData2Dto(entity.getTimeOfLastLogout(), dto.getMetaData().getMetaData("timeOfLastLogout")));
      dto.setNumberOfFailedLoginAttemps((java.lang.Integer)convertEntityData2Dto(entity.getNumberOfFailedLoginAttemps(), dto.getMetaData().getMetaData("numberOfFailedLoginAttemps")));
      dto.setTerminalId((java.lang.Long)convertEntityData2Dto(entity.getTerminalId(), dto.getMetaData().getMetaData("terminalId")));
      dto.setHostName((java.lang.String)convertEntityData2Dto(entity.getHostName(), dto.getMetaData().getMetaData("hostName")));
      dto.setEmailAddress((java.lang.String)convertEntityData2Dto(entity.getEmailAddress(), dto.getMetaData().getMetaData("emailAddress")));
      dto.setTelephoneNumber((java.lang.String)convertEntityData2Dto(entity.getTelephoneNumber(), dto.getMetaData().getMetaData("telephoneNumber")));
      dto.setMobileTelephoneNumber((java.lang.String)convertEntityData2Dto(entity.getMobileTelephoneNumber(), dto.getMetaData().getMetaData("mobileTelephoneNumber")));
      dto.setLocale((java.lang.String)convertEntityData2Dto(entity.getLocale(), dto.getMetaData().getMetaData("locale")));
      if (processReferences) dto.setPassword(dtoMapperFactory.create(com.dematic.trainingwarehouse.ui.server.dto.ETrainPasswordDtoMapper.class).mapEntity2DtoWithoutReferences(entity.getPassword()));
      super.fillDtoFromEntity(dto, entity, processReferences);
   }

   @Override
   protected Class<? extends com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto> getSpecificDtoClass() {
      return com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto.class;
   }

}
