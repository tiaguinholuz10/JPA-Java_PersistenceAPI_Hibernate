package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.GenerationType;
import javax.persistence.Persistence;

import br.com.tt.model.Endereco;
import br.com.tt.model.Cliente;

public class Sistema {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
		em.getTransaction().begin();
			Cliente pessoa = getPessoa();
			Endereco endereco = getEndereco();
				pessoa.setEndereco(endereco);
			//	endereco.setPessoa(pessoa);
		em.persist(pessoa);
	//	em.persist(endereco);
		em.getTransaction().commit();
		Endereco end = em.find(Endereco.class, endereco.getId());
		System.out.println(end.getRua());
	
		Cliente p = em.find(Cliente.class, pessoa.getId());
		System.out.println(p.getEndereco().getRua());
			System.exit(0);
	}
	private static Cliente getPessoa() {
		Cliente pessoa = new Cliente();
		pessoa.setNome("Maria");
		return pessoa;
	}
	private static Endereco getEndereco() {
		Endereco endereco = new Endereco();
		endereco.setRua("Argentina");
		return endereco; 	}
}
