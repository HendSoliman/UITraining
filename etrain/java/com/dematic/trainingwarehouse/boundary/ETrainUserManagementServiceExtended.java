/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import javax.ejb.Stateless;
import javax.enterprise.inject.Specializes;

/**
 * @author Markus Leichter
 *
 */
@Stateless
@Specializes
public class ETrainUserManagementServiceExtended extends ETrainUserManagementService {

   @Override
   public String welcomeUser(String username) {
      String result = super.welcomeUser(username);
      return result.toUpperCase();
   }

   public String welcomeGuest(String username) {
      assertThat("username", username, is(notNullValue()));
      String reveresed = new StringBuffer(username).reverse().toString();
      return reveresed;
   }
}
