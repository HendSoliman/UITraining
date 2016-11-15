package com.dematic.trainingwarehouse.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ETrainUser.class)
public abstract class ETrainUser_ extends com.dematic.wms.app.base.entity.AbstractEntity_ {

	public static volatile SingularAttribute<ETrainUser, Integer> numberOfFailedLoginAttemps;
	public static volatile SingularAttribute<ETrainUser, String> locale;
	public static volatile SingularAttribute<ETrainUser, Boolean> passwordChangeable;
	public static volatile SingularAttribute<ETrainUser, String> emailAddress;
	public static volatile SingularAttribute<ETrainUser, Date> timeOfLastLogout;
	public static volatile SingularAttribute<ETrainUser, ETrainPassword> password;
	public static volatile SingularAttribute<ETrainUser, Date> timeOfLastLogin;
	public static volatile SingularAttribute<ETrainUser, Long> terminalId;
	public static volatile SingularAttribute<ETrainUser, String> mobileTelephoneNumber;
	public static volatile SingularAttribute<ETrainUser, String> description;
	public static volatile SingularAttribute<ETrainUser, String> telephoneNumber;
	public static volatile SingularAttribute<ETrainUser, String> userName;
	public static volatile SingularAttribute<ETrainUser, String> hostName;
	public static volatile SingularAttribute<ETrainUser, String> fullName;
	public static volatile SingularAttribute<ETrainUser, Boolean> locked;
	public static volatile SingularAttribute<ETrainUser, Boolean> loggedOn;
	public static volatile ListAttribute<ETrainUser, ETrainGroup> groups;

}

