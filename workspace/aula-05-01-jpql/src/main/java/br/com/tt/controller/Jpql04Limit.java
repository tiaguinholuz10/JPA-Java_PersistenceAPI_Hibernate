package br.com.tt.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql04Limit {
	public static void main(String[] args) {

		
		
		
		TypedQuery<Cliente> query = getEm()
				.createQuery("SELECT c FROM CLIENTE C", Cliente.class);
		query.setFirstResult(2);
		query.setMaxResults(2);		
		List<Cliente> resultList = query.getResultList();
		resultList.forEach(c -> System.out.println(c));

		System.exit(0);
	}

	private static EntityManager getEm() {

		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}

}
