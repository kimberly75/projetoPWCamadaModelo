package br.edu.ifsul.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Instituicao.class)
public abstract class Instituicao_ {

	public static volatile SingularAttribute<Instituicao, Date> anoFundacao;
	public static volatile SingularAttribute<Instituicao, String> nome;
	public static volatile SingularAttribute<Instituicao, Integer> id;

	public static final String ANO_FUNDACAO = "anoFundacao";
	public static final String NOME = "nome";
	public static final String ID = "id";

}

