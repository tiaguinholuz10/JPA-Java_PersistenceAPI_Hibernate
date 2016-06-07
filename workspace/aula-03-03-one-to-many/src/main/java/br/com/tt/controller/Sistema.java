package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Cliente;
import br.com.tt.model.Telefone;
import br.com.tt.model.TelefoneType;

public class Sistema {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
		em.getTransaction().begin();

		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		cliente.addTelefone(new Telefone(
				"51","9999",TelefoneType.CELULAR));
		cliente.addTelefone(new Telefone(
				"51","32659821",TelefoneType.COMERCIAL));
		em.persist(cliente);
		em.getTransaction().commit();
		System.exit(0);
	}

}
