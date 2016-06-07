package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Em {
	private EntityManager em;

	public EntityManager get(String pu) {
		if (!(em != null && em.isOpen())) {
	
		em = Persistence.createEntityManagerFactory(pu)
				.createEntityManager();
		}
		return em;
	}
	
}
