package model;

import java.util.List;

public final class Professor {

	private long id;
	private String nome;
	private List<Aula> aulas;
	
	public Professor(int id, String nome, List<Aula> aulas) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.nome = nome;
		this.aulas = aulas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

}
