/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.client.service;

import com.dematic.wms.app.base.ui.client.service.MasterDtoServiceBase;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * asynchronous service interface for ETrainGroupDto
 * @author Hend Soliman
 */

@RemoteServiceRelativePath("ETrainGroupService.gwtrpc")
public interface ETrainGroupService extends MasterDtoServiceBase<ETrainGroupDto>, RemoteService {
}
