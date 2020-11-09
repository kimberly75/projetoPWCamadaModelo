package br.edu.ifsul.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Professor.class)
public abstract class Professor_ extends br.edu.ifsul.modelo.Aluno_ {

	public static volatile SingularAttribute<Professor, String> topicosdeinteresse;
	public static volatile SingularAttribute<Professor, String> titulacao;
	public static volatile SingularAttribute<Professor, Especialidade> especialidade;

	public static final String TOPICOSDEINTERESSE = "topicosdeinteresse";
	public static final String TITULACAO = "titulacao";
	public static final String ESPECIALIDADE = "especialidade";

}

