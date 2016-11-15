package com.dematic.trainingwarehouse.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ETrainTerminal.class)
public abstract class ETrainTerminal_ extends com.dematic.wms.app.base.entity.AbstractEntity_ {

	public static volatile SingularAttribute<ETrainTerminal, String> terminalName;
	public static volatile SingularAttribute<ETrainTerminal, ETrainUser> user;
	public static volatile SingularAttribute<ETrainTerminal, Integer> terminalNumber;
	public static volatile SingularAttribute<ETrainTerminal, String> ipAddress;

}

