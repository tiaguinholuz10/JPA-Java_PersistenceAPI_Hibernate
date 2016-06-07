package br.com.tt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente extends Pessoa {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_seq", allocationSize = 1)
	@GeneratedValue(generator = "cliente_seq", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private double valor;
	private String produto;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf, double valor, String produto) {
		super(nome, cpf);
		this.valor = valor;
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

}
