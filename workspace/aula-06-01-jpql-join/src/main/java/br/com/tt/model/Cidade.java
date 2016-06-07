package br.com.tt.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the cidades database table.
 * 
 */
@Entity
@Table(name="cidades")
@NamedQueries({
	@NamedQuery(name=Cidade.FIND_ALL, query="SELECT c FROM Cidade c"),
	@NamedQuery(name=Cidade.ESTADO, query= ""
			 +" SELECT c FROM Cidade c "
			 +" where c.estado.sigla = 'RS' ")
})
public class Cidade implements Serializable {
	
	public static final String FIND_ALL = "Cidade.findAll";
	public static final String ESTADO = "queryEstado";

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "cidade_seq", sequenceName = "cidade_seq", allocationSize = 1)
	@GeneratedValue(generator = "cidade_seq", strategy = GenerationType.SEQUENCE)
	
	private Integer id;

	private BigDecimal area;

	@Column(name="codigo_ibge")
	private Integer codigoIbge;

	@Column(name="densidade_demo")
	private BigDecimal densidadeDemo;

	private String gentilico;

	private String nome;

	@Column(name="populacao_2010")
	private Integer populacao2010;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	private Estado estado;

	public Cidade() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getArea() {
		return this.area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public Integer getCodigoIbge() {
		return this.codigoIbge;
	}

	public void setCodigoIbge(Integer codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public BigDecimal getDensidadeDemo() {
		return this.densidadeDemo;
	}

	public void setDensidadeDemo(BigDecimal densidadeDemo) {
		this.densidadeDemo = densidadeDemo;
	}

	public String getGentilico() {
		return this.gentilico;
	}

	public void setGentilico(String gentilico) {
		this.gentilico = gentilico;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPopulacao2010() {
		return this.populacao2010;
	}

	public void setPopulacao2010(Integer populacao2010) {
		this.populacao2010 = populacao2010;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade [id=" + id + ", area=" + area
				+ ", codigoIbge=" + codigoIbge
				+ ", densidadeDemo=" + densidadeDemo
				+ ", gentilico=" + gentilico + ", nome=" + nome
				+ ", populacao2010=" + populacao2010 + ", estado="
				+ estado + "]";
	}

}