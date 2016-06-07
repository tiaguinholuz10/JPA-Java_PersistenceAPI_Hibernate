package br.com.tt.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
	@NamedQuery(name=Cliente.ALL,  query="SELECT c FROM Cliente c "),
	@NamedQuery(name="nome",  query="SELECT c FROM Cliente c "
	           + "WHERE c.nome = :nome"),
})
public class Cliente implements Serializable {
	public static final String ALL = "Cliente.all";
	public static final String QUERY_NOME = "CLIENTE_QUERY_NOME";
	
	public static final String CONSULTAR_NOME = "SELECT c FROM c CLIENTE" + " WHERE c.nome = :nome";

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "pessoa_seq", sequenceName = "pessoa_seq", allocationSize = 1)
	@GeneratedValue(generator = "pessoa_seq", strategy = GenerationType.SEQUENCE)

	private Long id;
	private String nome;
	@Column(length = 11)
	private String cpf;
	private String rg;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_nasc")
	private Date dataNasc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
