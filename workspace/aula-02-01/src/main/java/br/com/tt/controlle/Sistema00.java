package br.com.tt.controlle;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;

public class Sistema00 {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();

		Aluno aluno = new Aluno();
		aluno.setNome("Teste");
		em.getTransaction().begin();
		em.persist(aluno);
		Aluno find = em.find(Aluno.class, 11L);
		System.out.println(find.getNome());
		aluno.setNome("Teste Teste");
		
		Aluno find2 = em.find(Aluno.class, 1L);
		find2.setNome("Novo Teste");

		em.getTransaction().commit();
		em.getTransaction().begin();
		Aluno find3 = em.find(Aluno.class, 2L);
		find3.setNome("Novo Teste 3");
		em.getTransaction().commit();
		System.exit(0);
	}

}
