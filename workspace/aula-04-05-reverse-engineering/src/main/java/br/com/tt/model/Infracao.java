package br.com.tt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the infracao database table.
 * 
 */
@Entity
@NamedQuery(name="Infracao.findAll", query="SELECT i FROM Infracao i")
public class Infracao implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Timestamp data;
	private String motivo;
	private List<Veiculo> veiculos;

	public Infracao() {
	}


	@Id
	@SequenceGenerator(name="INFRACAO_ID_GENERATOR", sequenceName="INFRACAO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INFRACAO_ID_GENERATOR")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Timestamp getData() {
		return this.data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}


	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	//bi-directional many-to-many association to Veiculo
	@ManyToMany(mappedBy="infracaos")
	public List<Veiculo> getVeiculos() {
		return this.veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

}