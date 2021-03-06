package model;

import java.util.ArrayList;
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
	
	private Sistema() {
		// TODO Auto-generated constructor stub
		
		horarios = new ArrayList<Horario>();
		restricoes = new ArrayList<Restricao>();
	}

	public static Sistema init() {
		
		//caso ainda nao tenha sido criado
		if(sistema==null) {
			sistema = new Sistema();
		}
		
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
