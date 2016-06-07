package br.com.tt.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql11NameQuery {
	public static void main(String[] args) {
		
		EntityManager em = getEm();
		Class<Cliente> clazz = Cliente.class;	
		
		TypedQuery<Cliente> query;
		query = em.createNamedQuery(Cliente.ALL, clazz);
		query.forEach(c -> System.out.println(c));

		
		

		
	}

	private static EntityManager getEm() {

		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}

}
