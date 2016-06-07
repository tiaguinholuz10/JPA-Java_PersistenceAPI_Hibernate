package br.com.tt.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql03ConsultaComConstante {
	public static void main(String[] args) {
		
		TypedQuery<Cliente> query = getEm()
				.createQuery(Cliente.CONSULTAR_NOME, Cliente.class );
		query.setParameter("nome", "Carlos");
		List<Cliente> resultList = query.getResultList();
		resultList.forEach(c -> System.out.println(c));

	}
	private static EntityManager getEm() {

		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}
	
	

}
