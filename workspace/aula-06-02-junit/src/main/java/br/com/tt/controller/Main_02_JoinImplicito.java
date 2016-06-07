package br.com.tt.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;

public class Main_02_JoinImplicito {

	public static void main(String[] args) {
		EntityManager em = Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();

		String sql = "SELECT c FROM Cidade c ";
		sql += " LEFT JOIN c.estado e ";
		sql += " WHERE e.sigla = :sigla ";
		sql += "AND c.nome = :cidade";
		TypedQuery<Cidade> query = null;
		query = em.createQuery(sql, Cidade.class);
		query.setParameter("sigla", "RS");
		query.setParameter("cidade", "Porto Alegre");
		List<Cidade> cidades = query.getResultList();
		for (Cidade cidade : cidades) {
			System.out.println(cidade);
		}

		System.exit(0);
	}

}
