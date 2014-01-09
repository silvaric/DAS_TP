package model;

import java.util.List;

public class Turma {
	
	private long id;
	private List<Aula> aulas;
	private List<Aluno> alunos;

	public Turma(long id, List<Aula> aulas, List<Aluno> alunos) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.aulas = aulas;
		this.setAlunos(alunos);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
