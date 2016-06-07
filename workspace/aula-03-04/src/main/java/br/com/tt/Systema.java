package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Systema {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();

		Turma turma = new Turma();
		turma.setNome("JPA");
		turma.addAluno(new Aluno("Carlos"));
		turma.addAluno(new Aluno("Bruno"));
		turma.addAluno(new Aluno("Jose"));
		turma.addAluno(new Aluno("Pedro"));
		turma.addAluno(new Aluno("Rafael"));
		turma.addAluno(new Aluno("Juliano"));
		em.getTransaction().begin();
		em.persist(turma);
		
		em.getTransaction().commit();
		System.out.println(turma.getId());
		System.exit(0);

	}

}
