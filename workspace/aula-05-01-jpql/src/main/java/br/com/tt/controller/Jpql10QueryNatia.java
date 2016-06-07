package br.com.tt.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql10QueryNatia {
	public static void main(String[] args) {
		
		EntityManager em = getEm();
		Class<Cliente> clazz = Cliente.class;		
		String sql =  " SELECT c FROM CLIENTE c ";
		Query query = em.createNativeQuery(sql, clazz);
		List<Cliente> clientes = query.getResultList();
		clientes.forEach(c -> System.out.println(c));

		
		

		
	}

	private static EntityManager getEm() {

		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}

}
