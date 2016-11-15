/*
 * Copyright (c) Dematic GmbH 2012. All rights reserved. Confidential.
 */
package com.dematic.trainingwarehouse.boundary.rest;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

import com.dematic.trainingwarehouse.entity.SimpleTechnicalEntity;
import com.dematic.wms.app.base.AbstractStateless;

/**
 * @author Markus Leichter
 */
@Stateless
public class TechnicalEntiyService extends AbstractStateless {


   @Asynchronous
   public void create(String name) {
      final SimpleTechnicalEntity entity = ef.createInstance(SimpleTechnicalEntity.class);
      entity.setMyName(name + "_ENTITY_" + System.nanoTime());
      em.persist(entity);
   }


}
