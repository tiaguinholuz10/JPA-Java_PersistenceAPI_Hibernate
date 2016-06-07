package br.com.tt.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Telefone implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "telefone_seq", sequenceName = "telefone_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "telefone_seq")
	private long id;
	@Column(length = 2)
	private String ddd;
	@Column(length = 9)
	private String numero;

	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_TELEFONE")
	private TelefoneType telefoneType;
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name= "cliente_id")
	private Cliente cliente;

	public Telefone() {
		super();
	}

	public Telefone(String ddd, String numero, TelefoneType telefoneType) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.telefoneType = telefoneType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TelefoneType getTelefoneType() {
		return telefoneType;
	}

	public void setTelefoneType(TelefoneType telefoneType) {
		this.telefoneType = telefoneType;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
