/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.service;

import com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto;
import com.dematic.wms.app.base.ui.client.service.DetailDtoServiceBase;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * asynchronous service interface for ETrainPermissionDto
 * @author Hend Soliman
 */

@RemoteServiceRelativePath("ETrainPermissionService.gwtrpc")
public interface ETrainPermissionService extends DetailDtoServiceBase <ETrainPermissionDto>, RemoteService {
}
