package com.dematic.trainingwarehouse.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ETrainTerminalSimple.class)
public abstract class ETrainTerminalSimple_ extends com.dematic.wms.app.base.entity.AbstractEntity_ {

	public static volatile SingularAttribute<ETrainTerminalSimple, String> terminalName;
	public static volatile SingularAttribute<ETrainTerminalSimple, String> type;
	public static volatile SingularAttribute<ETrainTerminalSimple, ETrainUser> user;
	public static volatile SingularAttribute<ETrainTerminalSimple, Integer> terminalNumber;
	public static volatile SingularAttribute<ETrainTerminalSimple, String> ipAddress;

}

