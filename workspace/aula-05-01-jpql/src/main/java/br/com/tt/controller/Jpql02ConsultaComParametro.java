package br.com.tt.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql02ConsultaComParametro {
	public static void main(String[] args) {
		
		EntityManager em = getEm();
		String sql= "SELECT c FROM CLIENTE c where c.nome = :nome";
		TypedQuery<Cliente> query = em.createQuery(sql, Cliente.class );
		query.setParameter("nome", "Carlos");
		List<Cliente> resultList = query.getResultList();
		resultList.forEach(c -> System.out.println(c));

	}
	private static EntityManager getEm() {

		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}
	
	

}
