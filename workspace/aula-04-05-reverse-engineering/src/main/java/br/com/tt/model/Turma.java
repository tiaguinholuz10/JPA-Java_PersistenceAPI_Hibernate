package br.com.tt.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the turma database table.
 * 
 */
@Entity
@NamedQuery(name="Turma.findAll", query="SELECT t FROM Turma t")
public class Turma implements Serializable {
	private static final long serialVersionUID = 1L;
	private TurmaPK id;
	private String professor;
	private Integer qtd;

	public Turma() {
	}


	@EmbeddedId
	public TurmaPK getId() {
		return this.id;
	}

	public void setId(TurmaPK id) {
		this.id = id;
	}


	public String getProfessor() {
		return this.professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}


	public Integer getQtd() {
		return this.qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

}