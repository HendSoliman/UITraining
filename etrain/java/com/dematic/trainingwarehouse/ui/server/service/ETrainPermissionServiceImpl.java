/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.server.service;

import com.dematic.trainingwarehouse.entity.ETrainGroup;
import com.dematic.trainingwarehouse.entity.ETrainPermission;
import com.dematic.trainingwarehouse.ui.client.service.ETrainPermissionService;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainPermissionDto;
import com.dematic.wms.app.base.ui.server.AppEntityDetailRemoteServerService;

/**
 * Server side implementation of the client side ETrainPermissionService
 * @author Hend Soliman
 */

public class ETrainPermissionServiceImpl   extends AppEntityDetailRemoteServerService<ETrainGroup, ETrainPermission, ETrainPermissionDto>
implements ETrainPermissionService  {
}
