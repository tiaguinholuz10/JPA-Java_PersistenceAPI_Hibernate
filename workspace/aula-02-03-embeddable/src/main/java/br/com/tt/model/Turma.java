package br.com.tt.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Turma {

	@EmbeddedId
	private TurmaPK id;

	private Integer qtd;

	private String professor;

	public TurmaPK getId() {
		return id;
	}

	public void setId(TurmaPK id) {
		this.id = id;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

}
