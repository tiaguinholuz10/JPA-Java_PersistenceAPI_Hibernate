package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Curso;
import br.com.tt.model.CursoPK;

public class Sistema {
	public static void main(String[] args) {
		EntityManager em = Persistence
				.createEntityManagerFactory("pu_jpa").createEntityManager();
		em.getTransaction().begin();
		
		Curso curso = new Curso();
		curso.setCodigo("JPA");
		curso.setVersao(4);
		curso.setDescricao("JPA - MOR");
		curso.setDuracao(28);
		em.persist(curso);
		
		
		CursoPK cursoPK = new CursoPK();
		cursoPK.setCodigo("JPA");
		cursoPK.setVersao(4);
		
		System.out.println(em.find(Curso.class, cursoPK));
		
		
		System.out.println(em.find(Curso.class, new CursoPK("JPA",3)));
		
		em.remove(em.find(Curso.class, cursoPK));
		em.getTransaction().commit();
		System.exit(0);

	}
}
