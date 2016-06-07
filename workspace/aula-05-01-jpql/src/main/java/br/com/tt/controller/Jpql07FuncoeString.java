package br.com.tt.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql07FuncoeString {
	public static void main(String[] args) {

		soma();
		media();
	}

	private static void soma() {
		EntityManager em = getEm();
		Class<Cliente> clazz = (Cliente.class);
		
		String sql = " SELECT c FROM CLIENTE c ";
		sql += "WHERE Trim(upper(c.nome) = trim(upper(:nome))";
		
		//TypeQuery<Cliente> query = em.createQuery(sql , clazz);
				
		System.out.println("Soma do ids" );

	}
	private static void media() {
		String sql = " SELECT MEDIA(c.id) FROM CLIENTE c ";
		TypedQuery<Double> query = getEm().createQuery(sql, Double.class);
		query.setFirstResult(2);
		query.setMaxResults(2);
		Double media = query.getSingleResult();
		System.out.println("Soma do ids" + media);
		
	}
	private static void max() {
		String sql = " SELECT MAX(c.id) FROM CLIENTE c ";
		TypedQuery<Double> query = getEm().createQuery(sql, Double.class);
		query.setFirstResult(2);
		query.setMaxResults(2);
		Double max= query.getSingleResult();
		System.out.println("Soma do ids" + max);
		
	}

	private static EntityManager getEm() {

		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}

}
