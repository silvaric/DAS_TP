package model;

import java.util.List;

public final class Sala {

	private long id;
	private String nome;
	
	public Sala(long id, String nome, List<Aula> aulas) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.nome = nome;
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
}
