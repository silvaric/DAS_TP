package model;

import java.util.List;

public final class Disciplina {

	private long id;
	private String sigla;
	private String nome;
	private List<Aula> aulas;
	private Ano ano;
	
	public Disciplina(long id, String sigla, String nome, List<Aula> aulas, Ano ano) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
		this.ano = ano;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
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

	public Ano getAno() {
		return ano;
	}

	public void setAno(Ano ano) {
		this.ano = ano;
	}
}
