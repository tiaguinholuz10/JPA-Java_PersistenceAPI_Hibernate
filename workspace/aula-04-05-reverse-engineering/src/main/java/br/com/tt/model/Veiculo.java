package br.com.tt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the veiculo database table.
 * 
 */
@Entity
@NamedQuery(name="Veiculo.findAll", query="SELECT v FROM Veiculo v")
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String placa;
	private List<Infracao> infracaos;

	public Veiculo() {
	}


	@Id
	@SequenceGenerator(name="VEICULO_ID_GENERATOR", sequenceName="VEICULO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VEICULO_ID_GENERATOR")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


	//bi-directional many-to-many association to Infracao
	@ManyToMany
	@JoinTable(
		name="veiculo_infracao"
		, joinColumns={
			@JoinColumn(name="veiculo_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="infracao_id")
			}
		)
	public List<Infracao> getInfracaos() {
		return this.infracaos;
	}

	public void setInfracaos(List<Infracao> infracaos) {
		this.infracaos = infracaos;
	}

}