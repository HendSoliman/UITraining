/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.server.service;

import com.dematic.wms.app.base.ui.server.AppEntityMasterRemoteServerService;
import com.dematic.trainingwarehouse.ui.client.service.ETrainGroupService;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainGroupDto;
import com.dematic.trainingwarehouse.entity.ETrainGroup;

/**
 * Server side implementation of the client side ETrainGroupService
 * @author Hend Soliman
 */

public class ETrainGroupServiceImpl extends AppEntityMasterRemoteServerService<ETrainGroup, ETrainGroupDto>
                                 implements ETrainGroupService {
}
