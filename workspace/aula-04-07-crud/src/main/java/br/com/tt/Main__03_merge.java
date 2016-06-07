package br.com.tt;

import javax.persistence.EntityManager;

import br.com.tt.model.Cliente;

public class Main__03_merge {
	public static void main(String[] args) {
		EntityManager em = new Em().get("pu_jpa");
		Cliente cliente = em.find(Cliente.class, 1L);
		em = null;
		
		System.out.println(cliente);
		cliente.setRazaoSocial("Foi para a tela e salvou3");
		 em = new Em().get("pu_jpa");
		 em.getTransaction().begin();
		 em.merge(cliente);
		 em.getTransaction().commit();
		 
		
		
	}

}
