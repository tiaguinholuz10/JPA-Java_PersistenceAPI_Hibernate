package br.com.tt.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;

public class Main_01_Empty {

	public static void main(String[] args) {
		EntityManager em = Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();

		String sql = "SELECT c FROM Cidade c ";
		sql += " WHERE c.estado IS NOT NULL";
		TypedQuery<Cidade> query = null;
		query = em.createQuery(sql, Cidade.class);
		List<Cidade> cidades = query.getResultList();
		for (Cidade cidade : cidades) {
			System.out.println(cidade);
		}

		System.exit(0);
	}

}
