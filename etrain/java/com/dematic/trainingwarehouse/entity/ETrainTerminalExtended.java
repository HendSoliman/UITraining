/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.dematic.wms.app.base.entity.annotation.LogicalKeyPart;
import com.dematic.wms.app.base.entity.annotation.Substitute;

/**
 * @author Markus Leichter
 *
 */
@Substitute
@Entity
@NamedQueries(value = {
         @NamedQuery(name = ETrainTerminalExtended.FIND_BY_EXTENSION, query = "SELECT terminal FROM ETrainTerminalExtended terminal WHERE terminal.extension = :extension"),
         @NamedQuery(name = ETrainTerminalExtended.FIND_ALL, query = "SELECT terminal FROM ETrainTerminalExtended terminal")})
@DiscriminatorValue("ETrainTerminalExtended")
public class ETrainTerminalExtended extends ETrainTerminal {

   private static final long serialVersionUID = 1L;

   public static final String FIND_BY_EXTENSION = "ETrainTerminalExtended.FIND_BY_EXTENSION";

   public static final String FIND_ALL = "ETrainTerminalExtended.FIND_ALL";

   @LogicalKeyPart(index = 1)
   protected String extension;

   protected ETrainTerminalExtended() {

   }

   /**
    * @return the extension
    */
   public String getExtension() {
      return extension;
   }

   /**
    * @param extension the extension to set
    */
   public void setExtension(String extension) {
      this.extension = extension;
   }

}
