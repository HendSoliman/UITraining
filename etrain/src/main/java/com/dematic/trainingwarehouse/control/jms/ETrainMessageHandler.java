/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.base.util.jms.MessageHandler;

/**
 * @author Markus Leichter
 *
 */
public class ETrainMessageHandler extends AbstractCDIBean implements MessageHandler<String> {
   @Override
   public String onMessage(Message message) throws JMSException {
      String messageText = null;
      if (message instanceof TextMessage) {
         TextMessage textMessage = (TextMessage) message;
         messageText = textMessage.getText();
         getLogger().info("**********************************RECEIVED message: " + messageText);
      }
      return messageText;
   }
}
