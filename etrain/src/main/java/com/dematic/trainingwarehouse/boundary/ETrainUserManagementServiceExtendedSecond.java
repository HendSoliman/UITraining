/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import javax.ejb.Stateless;

/**
 * @author Markus Leichter
 *
 */
@Stateless
//@Specializes
public class ETrainUserManagementServiceExtendedSecond {
   //extends ETrainUserManagementServiceExtended {

   public String welcomeUser(String username) {

      return username.toLowerCase();
   }
}
