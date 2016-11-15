/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.control.print;

import javax.inject.Inject;

import com.dematic.wms.app.base.AbstractCDIBean;
import com.dematic.wms.app.print.boundary.PrintProcessor;
import com.dematic.wms.app.print.boundary.exception.AbstractPrintException;

/**
 * @author Markus Leichter
 *
 */
public class ETrainUserPrinter extends AbstractCDIBean {
   public static final String PRINTER_ID = "ETrainPrinter";

   public static final String DOCUMENT_LAYOUT_ID = "ETrainDocumentTypeLayoutId";

   public static final String DOCUMENT_TYPE_ID = "ETrainDocumentType";

   @Inject
   protected PrintProcessor printProcessor;

   public ETrainPrintData printEtrainUser(String username) {
      ETrainPrintData data = new ETrainPrintData();
      data.setUsername(username);
      boolean async = false;
      String requestId = "requestId" + System.currentTimeMillis();
      try {
         printProcessor.print(data, DOCUMENT_TYPE_ID, DOCUMENT_LAYOUT_ID, PRINTER_ID,
                  requestId, async);
      } catch (AbstractPrintException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return data;
   }
}