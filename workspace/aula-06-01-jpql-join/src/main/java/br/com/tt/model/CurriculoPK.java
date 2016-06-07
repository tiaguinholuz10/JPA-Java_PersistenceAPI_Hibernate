package br.com.tt.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the curriculos database table.
 * 
 */
@Embeddable
public class CurriculoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cod_curso", insertable=false, updatable=false, unique=true, nullable=false)
	private Integer codCurso;

	@Column(name="cod_disc", insertable=false, updatable=false, unique=true, nullable=false)
	private Integer codDisc;

	public CurriculoPK() {
	}
	public Integer getCodCurso() {
		return this.codCurso;
	}
	public void setCodCurso(Integer codCurso) {
		this.codCurso = codCurso;
	}
	public Integer getCodDisc() {
		return this.codDisc;
	}
	public void setCodDisc(Integer codDisc) {
		this.codDisc = codDisc;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CurriculoPK)) {
			return false;
		}
		CurriculoPK castOther = (CurriculoPK)other;
		return 
			this.codCurso.equals(castOther.codCurso)
			&& this.codDisc.equals(castOther.codDisc);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codCurso.hashCode();
		hash = hash * prime + this.codDisc.hashCode();
		
		return hash;
	}
}