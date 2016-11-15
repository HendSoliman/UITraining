/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.eai;

import com.dematic.wms.app.base.AbstractStateless;

import javax.ejb.Stateless;
import java.util.List;

/**
 * @author Markus Leichter
 */
@Stateless
public class BusinessProcess extends AbstractStateless {

   public void execute(String boxIdentifier, String boxFormat, List<String> destinations) {

      for (String destination : destinations) {
         getLogger().info("For box {} with the format {} process destination {} ", boxIdentifier, boxFormat, destination);
      }

      //TODO When done send message to host
   }

}
