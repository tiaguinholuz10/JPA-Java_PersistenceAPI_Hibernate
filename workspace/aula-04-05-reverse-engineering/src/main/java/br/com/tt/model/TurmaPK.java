package br.com.tt.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the turma database table.
 * 
 */
@Embeddable
public class TurmaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String curso;
	private String mes;
	private String turno;

	public TurmaPK() {
	}

	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMes() {
		return this.mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getTurno() {
		return this.turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TurmaPK)) {
			return false;
		}
		TurmaPK castOther = (TurmaPK)other;
		return 
			this.curso.equals(castOther.curso)
			&& this.mes.equals(castOther.mes)
			&& this.turno.equals(castOther.turno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.curso.hashCode();
		hash = hash * prime + this.mes.hashCode();
		hash = hash * prime + this.turno.hashCode();
		
		return hash;
	}
}