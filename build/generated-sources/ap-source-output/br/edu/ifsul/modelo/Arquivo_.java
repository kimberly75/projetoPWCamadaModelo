package br.edu.ifsul.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Arquivo.class)
public abstract class Arquivo_ {

	public static volatile SingularAttribute<Arquivo, String> nomeArquivo;
	public static volatile SingularAttribute<Arquivo, byte[]> arquivo;
	public static volatile SingularAttribute<Arquivo, Integer> id;
	public static volatile SingularAttribute<Arquivo, String> descricao;

	public static final String NOME_ARQUIVO = "nomeArquivo";
	public static final String ARQUIVO = "arquivo";
	public static final String ID = "id";
	public static final String DESCRICAO = "descricao";

}

