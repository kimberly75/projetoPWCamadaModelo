package br.edu.ifsul.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Nota.class)
public abstract class Nota_ {

	public static volatile SingularAttribute<Nota, Aluno> aluno;
	public static volatile SingularAttribute<Nota, Double> nota02;
	public static volatile SingularAttribute<Nota, Double> nota01;
	public static volatile SingularAttribute<Nota, Integer> id;
	public static volatile SingularAttribute<Nota, Double> media;

	public static final String ALUNO = "aluno";
	public static final String NOTA02 = "nota02";
	public static final String NOTA01 = "nota01";
	public static final String ID = "id";
	public static final String MEDIA = "media";

}

