package br.com.tt.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the curriculos database table.
 * 
 */
@Entity
@Table(name="curriculos")
@NamedQuery(name="Curriculo.findAll", query="SELECT c FROM Curriculo c")
public class Curriculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CurriculoPK id;

	@Column(nullable=false)
	private Integer periodo;


	//bi-directional many-to-one association to Disciplina
	@ManyToOne
	@JoinColumn(name="cod_disc", nullable=false, insertable=false, updatable=false)
	private Disciplina disciplina;

	public Curriculo() {
	}

	public CurriculoPK getId() {
		return this.id;
	}

	public void setId(CurriculoPK id) {
		this.id = id;
	}

	public Integer getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}



	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}