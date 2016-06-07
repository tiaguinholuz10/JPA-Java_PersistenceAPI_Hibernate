package br.com.tt;

import javax.persistence.EntityManager;

import br.com.tt.model.Cliente;

public class Main_04_sincronizacao {
	public static void main(String[] args) {
		EntityManager em = new Em().get("pu_jpa");
		em.getTransaction().begin();
		Cliente cliente = new Main_04_sincronizacao().getCliente();
		em.persist(cliente);
		em.flush();
		em.getTransaction().commit();
		
		System.out.println("Contem o cliente = " + em.contains(cliente));
		em.clear();
		System.out.println("Executou o Clear");
	
		System.out.println("Contem o cliente = " + em.contains(cliente));
	    System.exit(0);
	}

	private Cliente getCliente() {

		Cliente cliente = new Cliente();
		cliente.setNomeFantasia("Ferragem do Juca");
		cliente.setCnpj("00006789099923");
		return cliente;
	}

}
