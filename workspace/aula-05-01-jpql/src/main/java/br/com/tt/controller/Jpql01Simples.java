package br.com.tt.controller;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql01Simples {
	public static void main(String[] args) {
		EntityManager em = getEm();
		//salvarCliente();
		
		String sql = "SELECT c FROM CLIENTE c";
		TypedQuery<Cliente> query = em.createQuery(sql, Cliente.class );
		List<Cliente> resultList = query.getResultList();
		resultList.forEach(c -> System.out.println( c));
		
		
		System.exit(0);
	}

	private static EntityManager getEm() {

		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}
	
	private static void salvarCliente(){
		Cliente cliente = new Cliente();
		cliente.setNome("bruno");
		cliente.setCpf("02689412500");
		cliente.setRg("1185889526");
		Calendar data = Calendar.getInstance();
		data.set(1990,Calendar.JANUARY,20);
		cliente.setDataNasc(data.getTime());
		
		
		EntityManager em = getEm();
		
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
	}
}
