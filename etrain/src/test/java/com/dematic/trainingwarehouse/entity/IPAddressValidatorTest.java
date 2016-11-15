/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;
import javax.validation.MessageInterpolator;
import javax.validation.Validation;
import javax.validation.Validator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dematic.trainingwarehouse.entity.ValidIP.IPAddressValidator;
import com.dematic.wms.app.TestFactory;

/**
 * @author Markus Leichter
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IPAddressValidatorTest {

   IPAddressValidator validator;

   @Mock
   private ConstraintValidatorContext contextMock;

   @Mock
   private MessageInterpolator messageInterpolator;

   private ETrainTerminal terminal;

   @Before
   public void setUp() {
      validator = new IPAddressValidator();
      terminal = TestFactory.createInstance(ETrainTerminal.class);
   }

   @Test
   public void testIPAddressValidator() {
      String ipAddress = "121212";
      terminal.setIpAddress(ipAddress);

      boolean objectValid = validator.isObjectValid(terminal, contextMock);
      assertFalse(objectValid);
   }

   @Test
   public void testIPAddressValidator2() {
      String ipAddress = "12.12.1.2";
      terminal.setIpAddress(ipAddress);
      boolean objectValid = validator.isObjectValid(terminal, contextMock);
      assertTrue(objectValid);
   }

   @Test
   public void testWithValidator() throws Exception {
      ETrainTerminal eTrainTerminal = TestFactory.createInstance(ETrainTerminal.class);
      eTrainTerminal.setName("nameWithMNoreThan8Chars");
      eTrainTerminal.setIpAddress("121212");
      eTrainTerminal.setType(ETrainTerminalType.BROWSER);

      Validator validatorBean = Validation.byDefaultProvider().configure().buildValidatorFactory().usingContext()
               .messageInterpolator(messageInterpolator).getValidator();
      Set<ConstraintViolation<ETrainTerminal>> validationResult = validatorBean.validate(eTrainTerminal);
      printValidationResult(validationResult);
      assertFalse(validationResult.isEmpty());

   }

   /**
    * @param validationResult
    */
   private void printValidationResult(Set<ConstraintViolation<ETrainTerminal>> validationResult) {
      for (ConstraintViolation<ETrainTerminal> violation : validationResult) {
         System.out.println("propertyPath:" + violation.getPropertyPath());
         System.out.println("invalidValue:" + violation.getInvalidValue());
         System.out.println("message     :" + violation.getMessage());
         System.out.println("MessageTemplate     :" + violation.getMessageTemplate());

         System.out.println("-----");
      }

   }
}
