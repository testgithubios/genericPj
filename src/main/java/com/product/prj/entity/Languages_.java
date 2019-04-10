package com.product.prj.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Languages.class)
public abstract class Languages_ {

	public static volatile SingularAttribute<Languages, String> name;
	public static volatile SingularAttribute<Languages, Long> id;
	public static volatile SingularAttribute<Languages, String> shortName;

	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String SHORT_NAME = "shortName";

}

