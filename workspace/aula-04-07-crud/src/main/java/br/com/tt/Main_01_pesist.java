package br.com.tt;

import javax.persistence.EntityManager;

import br.com.tt.model.Cliente;

public class Main_01_pesist {
	public static void main(String[] args) {
		EntityManager em = new Em().get("pu_jpa");
		em.getTransaction().begin();
		em.persist( new Main_01_pesist().getCliente());
		em.getTransaction().commit();
	}
	
	private Cliente getCliente(){
		
		Cliente cliente = new Cliente();
		cliente.setNomeFantasia("Ferragem do Juca");
		cliente.setCnpj("00006789099923");
		return cliente;
	}
}
