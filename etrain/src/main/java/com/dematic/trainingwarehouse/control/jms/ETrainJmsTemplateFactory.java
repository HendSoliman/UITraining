/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.jms;

import javax.annotation.Resource;
import javax.enterprise.inject.Produces;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;

import com.dematic.wms.app.base.util.jms.JmsTemplate;

/**
 * @author Markus Leichter
 *
 */
public class ETrainJmsTemplateFactory {

   // just reuse Event queue
   @Resource(mappedName = "QueueConnectionFactory")
   ConnectionFactory connectionFactory;

   @Resource(mappedName = "TestQueue")
   Queue queue;

   @Produces
   @ETrainJms
   public JmsTemplate createTemplate() {
      return new JmsTemplate(queue, connectionFactory);
   }

}
