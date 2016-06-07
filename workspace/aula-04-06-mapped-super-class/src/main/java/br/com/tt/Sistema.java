package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;
import br.com.tt.model.Cliente;
import br.com.tt.model.Professor;

public class Sistema {
public static void main(String[] args) {
	EntityManager em = Persistence
		.createEntityManagerFactory("pu_jpa")
		.createEntityManager();
	em.getTransaction().begin();
	em.persist(new Aluno("Maria","321654987","3256","JPA"));
	em.persist(new Cliente("Bruno","321654987",500D,"Consultoria"));
	em.persist(new Professor("Bruno",
			"321654987","234545",2500D,"Noite"));
	em.getTransaction().commit();
}
}
