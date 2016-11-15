/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.jms;

import javax.inject.Inject;

import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.base.util.jms.JmsTemplate;

/**
 * @author Markus Leichter
 *
 */
public class ETrainJmsReceiver extends AbstractCDIBean {

   @Inject
   @ETrainJms
   private JmsTemplate jmsTemplate;

   @Inject
   private ETrainMessageHandler messageHandler;

   public String receive() {
      String messageText = jmsTemplate.receiveInTrx(2_000l, messageHandler);
      getLogger().info("Received message" + messageText);
      return messageText;
   }

}
