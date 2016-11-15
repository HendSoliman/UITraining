/**
 * Copyright (c) Dematic GmbH 2016. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.ui.server.service;

import com.dematic.wms.app.base.ui.server.AppEntityMasterRemoteServerService;
import com.dematic.trainingwarehouse.ui.client.service.ETrainUserService;
import com.dematic.trainingwarehouse.ui.shared.dto.ETrainUserDto;
import com.dematic.trainingwarehouse.entity.ETrainUser;

/**
 * Server side implementation of the client side ETrainUserService
 * @author Hend Soliman
 */

public class ETrainUserServiceImpl extends AppEntityMasterRemoteServerService<ETrainUser, ETrainUserDto>
                                 implements ETrainUserService {
}
