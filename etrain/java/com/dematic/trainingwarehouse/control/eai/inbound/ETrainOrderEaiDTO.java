/*
 * Copyright (c) Dematic GmbH 2013. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.eai.inbound;

import com.dematic.wms.app.eai.control.EaiDTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author Markus Leichter
 */
@XmlRootElement(name="etrainOrder") // Only required, if you process XML data
@XmlAccessorType(XmlAccessType.FIELD)
public class ETrainOrderEaiDTO implements EaiDTO {

   @XmlElement(required=true)
   private String boxIdentifier;

   @XmlElement(required=true)
   private String boxFormat;

   private List<String> destinations;

   public String getBoxIdentifier() {
      return boxIdentifier;
   }

   public void setBoxIdentifier(String boxIdentifier) {
      this.boxIdentifier = boxIdentifier;
   }

   public String getBoxFormat() {
      return boxFormat;
   }

   public void setBoxFormat(String boxFormat) {
      this.boxFormat = boxFormat;
   }

   public List<String> getDestinations() {
      return destinations;
   }

   public void setDestinations(List<String> destinations) {
      this.destinations = destinations;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      ETrainOrderEaiDTO that = (ETrainOrderEaiDTO) o;

      if (boxFormat != null ? !boxFormat.equals(that.boxFormat) : that.boxFormat != null) return false;
      if (boxIdentifier != null ? !boxIdentifier.equals(that.boxIdentifier) : that.boxIdentifier != null) return false;
      if (destinations != null ? !destinations.equals(that.destinations) : that.destinations != null) return false;

      return true;
   }

   @Override
   public int hashCode() {
      int result = boxIdentifier != null ? boxIdentifier.hashCode() : 0;
      result = 31 * result + (boxFormat != null ? boxFormat.hashCode() : 0);
      result = 31 * result + (destinations != null ? destinations.hashCode() : 0);
      return result;
   }
}
