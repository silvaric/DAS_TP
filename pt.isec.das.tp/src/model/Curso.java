package model;

import java.util.List;

public class Curso {
	
	private long id;
	private String name;
	private List<Ano> anos;

	public Curso(long id, String designacao, List<Ano> anos) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = designacao;
		this.anos = anos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesignacao() {
		return name;
	}

	public void setDesignacao(String designacao) {
		this.name = designacao;
	}

	public List<Ano> getAnos() {
		return anos;
	}

	public void setAnos(List<Ano> anos) {
		this.anos = anos;
	}

}
