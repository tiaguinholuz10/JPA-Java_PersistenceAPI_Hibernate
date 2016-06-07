package br.com.tt.controller;

import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpq01lSimples {
	public static void main(String[] args) {
		EntityManager em = getEm();
		// salvarCliente();

		String sql = "SELECT c FROM Cliente c";
		TypedQuery<Cliente> query = em.createQuery(sql, Cliente.class);
		List<Cliente> resultList = query.getResultList();
		resultList.forEach(c -> out.println(c));
		exit(0);
	}

	private static EntityManager getEm() {
		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}

	private static void salvarCliente() {
		Cliente cliente = new Cliente();
		cliente.setNome("Marcia");
		cliente.setCpf("4444");
		cliente.setRg("9999");
		Calendar data = Calendar.getInstance();
		data.set(1990, 6, 5);
		cliente.setDataNasc(data.getTime());

		EntityManager em = getEm();

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
	}
}
