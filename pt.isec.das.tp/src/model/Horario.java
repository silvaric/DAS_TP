package model;

import java.util.List;

public final class Horario {
	
	private long id;
	private String sala;
	private List<Aula> aulas;
	
	public Horario(long id, String sala, List<Aula> aulas) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.sala = sala;
		this.aulas = aulas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
}
