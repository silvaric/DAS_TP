package model;

import java.sql.Timestamp;
import java.util.List;

public final class Data {
	
	private long id;
	private int dia;
	private List<Timestamp> horas; 
	private List<Aula> aulas;
	
	public Data(long id, int dia, List<Timestamp> horas, List<Aula> aulas) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.dia = dia;
		this.horas = horas;
		this.aulas = aulas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public List<Timestamp> getHoras() {
		return horas;
	}

	public void setHoras(List<Timestamp> horas) {
		this.horas = horas;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

}
