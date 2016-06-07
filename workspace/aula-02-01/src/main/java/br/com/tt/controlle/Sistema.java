package br.com.tt.controlle;

import java.util.Date;

import br.com.tt.dao.AlunoDAO;
import br.com.tt.model.Aluno;

public class Sistema {
	public static void main(String[] args) {
		AlunoDAO alunoDAO = new AlunoDAO();
		Aluno aluno = getAluno("Carlos", 123, new Date());
		System.out.println("criamos o aluno "+aluno.getNome());
		System.out.println("iniciando o salvar");
		alunoDAO.salvar(getAluno("Maria", 222222, new Date(1,1,1981)));
		alunoDAO.salvar(getAluno("Carolina", 333333, new Date(1,1,1970)));
		alunoDAO.salvar(getAluno("Carla", 44444, new Date(1,1,1990)));
		alunoDAO.salvar(getAluno("Carol", 5555, new Date(1,1,2000)));
		
		System.out.println("fim de salvar");
		System.out.println("iniciando o buscar");
		Aluno buscar = alunoDAO.buscar(1L);
		System.out.println("Aluno "+buscar.getNome()+" Retornou da base de dados");
		System.exit(0);
	}

	private static Aluno getAluno(String nome, Integer cpf, Date dataNasc) {
		Aluno aluno = new Aluno();
		aluno.setCpf(cpf);
		aluno.setNome(nome);
		aluno.setDataNasc(dataNasc);
		return aluno;
	}
}
