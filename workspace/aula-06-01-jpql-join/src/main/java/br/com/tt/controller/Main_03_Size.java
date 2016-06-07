package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Main_03_Size {

	public static void main(String[] args) {
		EntityManager em = Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();

		String sql = "SELECT SIZE(e.cidades) FROM Estado e ";
		sql += " WHERE e.sigla = :sigla ";

		TypedQuery<Integer> query = null;
		query = em.createQuery(sql, Integer.class);
		query.setParameter("sigla", "RS");
		Integer qtdCidades = query.getSingleResult();
		System.out
				.println("RS possui " + qtdCidades + " Cidades");
		System.exit(0);
	}

}
