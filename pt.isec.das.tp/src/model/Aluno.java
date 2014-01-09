package model;

public final class Aluno {

	private long id;
	private String nome;
	
	public Aluno(long id, String nome) {
		// TODO Auto-generated constructor stub
		
		this.setId(id);
		this.setNome(nome);
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
