package br.com.tt.controller;

import static java.lang.System.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql07FuncoesString {
	public static void main(String[] args) {
		EntityManager em = getEm();
		Class<Cliente> clazz = Cliente.class;
		String nomeDigitado = "   bruno ";
		String sql = "SELECT c FROM Cliente c ";
		sql += " WHERE trim(upper(c.nome)) = trim(upper(:nome))";

		TypedQuery<Cliente> query = em.createQuery(sql, clazz);
		query.setParameter("nome", nomeDigitado);
		List<Cliente> clientes = query.getResultList();
		clientes.forEach(c -> out.println(c));
	}

	private static EntityManager getEm() {
		return Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
	}
}
