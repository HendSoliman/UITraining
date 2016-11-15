/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.eai.inbound;

import com.dematic.trainingwarehouse.control.eai.BusinessProcess;
import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.eai.control.inbound.Digester;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.inject.Inject;

/**
 * @author Markus Leichter
 */
public class ETrainOrderDigester  extends AbstractCDIBean implements Digester<ETrainOrderEaiDTO> {
   @Inject
   BusinessProcess businessProcess;

   @Override
   public void process(ETrainOrderEaiDTO dto) {
      //Call business logic from here
      getLogger().info("About to process {}", ToStringBuilder.reflectionToString(dto) );
      businessProcess.execute(dto.getBoxIdentifier(),dto.getBoxFormat(), dto.getDestinations() );
   }
}
