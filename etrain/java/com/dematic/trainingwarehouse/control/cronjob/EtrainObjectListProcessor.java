/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.cronjob;

import com.dematic.trainingwarehouse.entity.ETrainUser;
import com.dematic.wms.app.cron.control.AbstractObjectListProcessor;
import com.dematic.wms.app.cron.control.config.CronjobConfiguration;

/**
 * @author Markus Leichter
 *
 */
public class EtrainObjectListProcessor extends AbstractObjectListProcessor<ETrainUser> {

   /* (non-Javadoc)
    * @see com.dematic.wms.app.cron.control.AbstractObjectListProcessor#processObject(java.lang.Object, com.dematic.wms.app.cron.control.config.CronjobConfiguration)
    */
   @Override
   protected void processObject(ETrainUser user, CronjobConfiguration configuration) {
      getLogger().debug("About to delete user: {}", user);
      em.remove(user);

   }

}
