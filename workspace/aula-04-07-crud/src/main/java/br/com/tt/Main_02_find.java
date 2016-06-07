package br.com.tt;

import javax.persistence.EntityManager;

import br.com.tt.model.Cliente;

public class Main_02_find {
	public static void main(String[] args) {
		EntityManager em = new Em().get("pu_jpa");
		Cliente cliente = em.find(Cliente.class, 1L);
		System.out.println(cliente);
		 cliente = em.find(cliente.getClass(), cliente.getId());
		 System.out.println(cliente);
	}

}
