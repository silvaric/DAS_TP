package model;

import java.util.List;

/**
 * * Classe singleton que representa todo o sistema
 * 
 * @author RubaiyaT
 * 
 *
 */
public final class Sistema {

	private List<Horario> horarios;
	private List<Restricao> restricoes;
	
	//membro estatico da classe
	public static Sistema sistema;
	
	private Sistema(List<Horario> horarios, List<Restricao> restricoes) {
		// TODO Auto-generated constructor stub
		
		this.horarios = horarios;
		this.restricoes = restricoes;
	}

	public static Sistema init() {
		
		//caso ainda nao tenha sido criado
		if(sistema==null)
			sistema = new Sistema();
		
		return sistema;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public List<Restricao> getRestricoes() {
		return restricoes;
	}

	public void setRestricoes(List<Restricao> restricoes) {
		this.restricoes = restricoes;
	}

}
