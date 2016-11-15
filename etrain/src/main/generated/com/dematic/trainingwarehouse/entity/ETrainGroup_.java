package com.dematic.trainingwarehouse.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ETrainGroup.class)
public abstract class ETrainGroup_ extends com.dematic.wms.app.base.entity.AbstractEntity_ {

	public static volatile ListAttribute<ETrainGroup, ETrainUser> users;
	public static volatile SingularAttribute<ETrainGroup, String> groupName;
	public static volatile SingularAttribute<ETrainGroup, String> description;
	public static volatile ListAttribute<ETrainGroup, ETrainPermission> permissions;
	public static volatile ListAttribute<ETrainGroup, ETrainGroup> children;
	public static volatile SingularAttribute<ETrainGroup, ETrainGroup> parent;

}

