package model;

import java.util.List;

public abstract class Aula {
	
	private long id;
	private List<Horario> horarios;
	private Data data;
	private Sala sala;
	private Professor professor;
	private Turma turma;
	private Disciplina disciplina;
	
	public Aula() {
		// TODO Auto-generated constructor stub
	}
	
	public Aula(long id, List<Horario> horarios, Data data, Sala sala) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.horarios = horarios;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
