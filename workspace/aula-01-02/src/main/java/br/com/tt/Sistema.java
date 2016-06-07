package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.Pessoa;
import br.com.tt.model.TipoSexo;

public class Sistema {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("pu_jpa");
			em = emf.createEntityManager();

			System.out.println("Entity Manager esta " + em.isOpen());

			Pessoa pessoa = new Pessoa();
			pessoa.setNome("Maria Silva");
			pessoa.setCpf("45454");
			pessoa.setTipoSexo(TipoSexo.FEMININO);
			em.getTransaction().begin();
			em.persist(pessoa);
			em.persist(new Pessoa("Pedro", "25654654"));
			em.persist(new Pessoa("Daiane", "454545445"));
			em.persist(new Pessoa("Bruno", "56454545"));
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.clear();
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
			System.exit(0);
		}
	}

}
