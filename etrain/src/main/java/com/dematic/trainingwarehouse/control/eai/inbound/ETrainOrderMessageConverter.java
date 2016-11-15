/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.eai.inbound;

import com.dematic.wms.app.eai.control.inbound.InboundMessageConverter;
import com.dematic.wms.app.eai.entity.ErpMessage;

/**
 * @author Markus Leichter
 */
public class ETrainOrderMessageConverter implements InboundMessageConverter<ETrainOrderEaiDTO> {
   @Override
   public ETrainOrderEaiDTO convert(ErpMessage message) {


      return new ETrainOrderEaiDTO();
   }
}
