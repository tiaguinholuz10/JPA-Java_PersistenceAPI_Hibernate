package br.com.tt;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.Test;

import br.com.tt.model.Estado;

public class Teste {

	@Test
	public void test() {
		EntityManager em = Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();
		Estado estado = new Estado();
		estado.setSigla("AA");
		em.getTransaction().begin();
		em.persist(estado);
		em.getTransaction().commit();
		em.close();
		em = null;
		 em = Persistence
					.createEntityManagerFactory("pu_jpa")
					.createEntityManager();
		Estado e = em.find(Estado.class, 1);
		System.out.println(e.getSigla());
		em.close();
		

	}

}
