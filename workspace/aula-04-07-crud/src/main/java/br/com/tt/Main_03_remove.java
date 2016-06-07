package br.com.tt;

import javax.persistence.EntityManager;

import br.com.tt.model.Cliente;

public class Main_03_remove {

	public static void main(String[] args) {
		EntityManager em = new Em().get("pu_jpa");
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, 1L);
		em.remove(cliente);
		em.getTransaction().commit();
		System.exit(0);

	}

}
