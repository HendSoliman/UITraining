/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.policy;

import com.dematic.trainingwarehouse.entity.ETrainGroup;

/**
 * @author Markus Leichter
 *
 */
public interface ETrainGroupVetoFilter {
   public boolean isOkToDelete(ETrainGroup group);
}
