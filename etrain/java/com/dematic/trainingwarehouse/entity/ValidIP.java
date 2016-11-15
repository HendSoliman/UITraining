/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

import com.dematic.wms.app.base.validation.AbstractTypeConstraintValidator;

/**
 * @author Markus Leichter
 *
 */
@Documented
@Constraint(validatedBy = ValidIP.IPAddressValidator.class)
@Target({TYPE})
@Retention(RUNTIME)
public @interface ValidIP {
   String message() default "{com.dematic.trainingwarehouse.entity.ValidIP.message}";

   Class<?>[] groups() default {};

   Class<? extends Payload>[] payload() default {};

   public class IPAddressValidator extends AbstractTypeConstraintValidator<ValidIP, ETrainTerminal> {

      @Override
      public boolean isObjectValid(ETrainTerminal terminal, ConstraintValidatorContext context) {
         String s = terminal.getIpAddress();
         String[] digits = s.split("\\.");
         if (digits.length != 4) {
            return false;
         }
         for (String d : digits) {
            try {
               int i = Integer.parseInt(d);
               if (i < 0 || i > 255) {
                  return false;
               }
            } catch (NumberFormatException e) {
               return false;
            }
         }
         return true;

      }
   }

}
