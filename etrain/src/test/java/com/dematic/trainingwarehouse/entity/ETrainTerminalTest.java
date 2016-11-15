/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import javax.validation.Configuration;
import javax.validation.Validation;
import javax.validation.Validator;

import org.junit.Before;
import org.junit.Test;

import com.dematic.wms.app.TestFactory;
import com.dematic.wms.app.base.util.jpa.hibernate.LazyProxyLoadingResolver;

/**
 * @author Markus Leichter
 *
 */
public class ETrainTerminalTest {

   private Validator validator;

   @Before
   public void setUp() {
      validator = createValidator();
   }

   @Test
   public void testValidation() {
      ETrainTerminal terminal = TestFactory.createInstance(ETrainTerminal.class);
      terminal.setName("terminalname");
      terminal.setIpAddress("1.1.1.1");
      terminal.setType(ETrainTerminalType.BROWSER);

      terminal.validate(validator);

   }

   private Validator createValidator() {
      Configuration<?> configuration = Validation.byDefaultProvider().configure();
      configuration.traversableResolver(new LazyProxyLoadingResolver(configuration.getDefaultTraversableResolver()));
      return configuration.buildValidatorFactory().usingContext().getValidator();
   }

}
