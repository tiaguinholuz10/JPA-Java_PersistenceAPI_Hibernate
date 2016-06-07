package br.com.tt.controller;

import static java.lang.System.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql06Funcoes {
	public static void main(String[] args) {
		soma();
		media();
		max();
		size();
	}

	private static void soma() {
		String sql = "SELECT SUM(c.id) FROM Cliente c";
		TypedQuery<Long> query = getEm().createQuery(sql, Long.class);
		Long soma = query.getSingleResult();
		out.println("Soma dos IDs = " + soma);
	}
	private static void media() {
		String sql = "SELECT AVG(c.id) FROM Cliente c";
		TypedQuery<Double> query = getEm().createQuery(sql, Double.class);
		Double media = query.getSingleResult();
		out.println("Média dos IDs = " + media);
	}
	private static void max() {
		String sql = "SELECT MAX(c.id) FROM Cliente c";
		TypedQuery<Long> query = getEm().createQuery(sql, Long.class);
		Long max = query.getSingleResult();
		out.println("Maior dos Id = " + max);
	}
	private static void size() {
		String sql = "SELECT SIZE(c.id) FROM Cliente c";
		Class<Integer> clazz = Integer.class;
		EntityManager em = getEm();
		TypedQuery<Integer> query = em.createQuery(sql, clazz);
		Integer size = query.getSingleResult();
		out.println(size);
	
	}

	private static EntityManager getEm() {
		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}
}
