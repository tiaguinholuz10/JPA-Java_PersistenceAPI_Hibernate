package br.com.tt.controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import antlr.collections.impl.Vector;
import br.com.tt.model.Infracao;
import br.com.tt.model.Veiculo;

public class Sistema {
	public static void main(String[] args) {
		EntityManager em = Persistence
		.createEntityManagerFactory("pu_jpa")
		.createEntityManager();
		em.getTransaction().begin();
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca("INF6598");
		Infracao infracao = new Infracao();
		infracao.setMotivo("Cerveja");
		
		veiculo.setInfracoes(new ArrayList<Infracao>());
		veiculo.getInfracoes().add(infracao);
		
		infracao.setVeiculos(new ArrayList<Veiculo>());
		infracao.getVeiculos().add(veiculo);
		
		em.persist(veiculo);
		
		em.getTransaction().commit();
	}

}
