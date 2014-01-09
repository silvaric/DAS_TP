package model;

import java.util.List;

public class Ano {
	
	private long id;
	private List<Disciplina> disciplinas;

	public Ano() {
		// TODO Auto-generated constructor stub
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
