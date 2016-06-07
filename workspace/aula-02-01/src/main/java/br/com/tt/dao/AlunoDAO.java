package br.com.tt.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;

public class AlunoDAO implements IDAO<Aluno> {
	private EntityManagerFactory emf;
	private EntityManager em;

	public void salvar(Aluno entity) {
		getEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();

		fecharConexao();
	}

	private void getEntityManager() {
		// persistence.xml
		// <persistence-unit name="pu_jpa">
		emf = Persistence.createEntityManagerFactory("pu_jpa");
		em = emf.createEntityManager();

	}

	private void fecharConexao() {
		if (em != null && em.isOpen()) {
			em.clear();
			em.close();
		}
		if (emf != null && emf.isOpen()) {
			emf.close();
		}
	}

	public Aluno buscar(Long id) {
		getEntityManager();
		Aluno aluno = em.find(Aluno.class, id);
		fecharConexao();
		return aluno;
	}

}
