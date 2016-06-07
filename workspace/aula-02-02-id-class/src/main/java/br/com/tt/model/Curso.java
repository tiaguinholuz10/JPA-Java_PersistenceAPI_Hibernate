package br.com.tt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CursoPK.class)
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String codigo;
	@Id
	private Integer versao;

	private String descricao;
	private Integer duracao;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", versao=" + versao + ", descricao=" + descricao + ", duracao=" + duracao
				+ "]";
	}
	
	

}
