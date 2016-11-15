/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.jms;

import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.base.util.jms.JmsTemplate;
import com.dematic.wms.app.base.util.jms.MessageCreator;

/**
 * @author Markus Leichter
 *
 */
public class ETrainJmsSender extends AbstractCDIBean {

   @Inject
   @ETrainJms
   private JmsTemplate jmsTemplate;

   public void sendMessage(final String text) {
      jmsTemplate.sendInTrx(new MessageCreator() {

         @Override
         public Message create(Session session) throws JMSException {
            TextMessage textMessage = session.createTextMessage();
            textMessage.setText(text);
            return textMessage;
         }
      });
   }
}
