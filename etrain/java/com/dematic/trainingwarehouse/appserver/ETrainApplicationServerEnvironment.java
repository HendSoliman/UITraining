/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.appserver;

import static com.dematic.wms.app.appserver.BaseApplicationServerSetup.ACTIVEMQRAR;

import com.dematic.wms.app.appserver.BaseApplicationServerSetup;
import com.dematic.wms.appserver.ApplicationServerEnvironment;
import com.dematic.wms.appserver.ApplicationServerEnvironmentBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * @author Markus Leichter
 */
public class ETrainApplicationServerEnvironment implements ApplicationServerEnvironment {
   @Override
   public ApplicationServerEnvironmentBuilder configure(ApplicationServerEnvironmentBuilder builder) {
      builder.addQueue("TestQueue", ACTIVEMQRAR);
      return builder;
   }

   @Override
   public List<Class<? extends ApplicationServerEnvironment>> getDependencies() {
      return Arrays.<Class<? extends ApplicationServerEnvironment>>asList(BaseApplicationServerSetup.class);
   }
}
