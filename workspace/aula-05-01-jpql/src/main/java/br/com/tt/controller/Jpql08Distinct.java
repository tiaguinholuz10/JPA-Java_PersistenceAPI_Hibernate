package br.com.tt.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql08Distinct {
	public static void main(String[] args) {

		
	}
	
	private static void soma(){
		EntityManager em = getEm();
		Class<Cliente> clazz = (Cliente.class);
		
		String sql = " SELECT c FROM CLIENTE c ";
		sql += "WHERE Trim(upper(c.nome) = trim(upper(:nome))";
		
		//TypeQuery<Cliente> query = em.createQuery(sql , clazz);
				
		System.out.println("Soma do ids" );

	}
	

	private static EntityManager getEm() {

		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}

}
