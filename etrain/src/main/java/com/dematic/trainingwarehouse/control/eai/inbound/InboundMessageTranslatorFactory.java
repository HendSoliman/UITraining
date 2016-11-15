/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.eai.inbound;

import com.dematic.wms.app.eai.control.inbound.ConfigurableInboundMessageTranslator;
import com.dematic.wms.app.eai.control.inbound.UnitTypeAndSenderBasedMessageSelector;

import javax.enterprise.inject.Produces;

/**
 * @author Markus Leichter
 */
public class InboundMessageTranslatorFactory {
   @Produces
   public com.dematic.wms.app.eai.control.inbound.InboundMessageTranslator eTrainOrderTranslator(ETrainOrderMessageConverter converter, ETrainOrderDigester digester) {
      return new ConfigurableInboundMessageTranslator<>(
               new UnitTypeAndSenderBasedMessageSelector("FIELD_IN_ERP_TABLE", "SAP"),
               converter, digester);
   }
}
