package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	
	@ManyToOne
	@JoinColumn(name = "EleitorId")
	private Eleitor Eleitor;
	
	
	@ManyToOne
	@JoinColumn(name = "CandidatoId")
	private Candidato Candidato;
	
	@ManyToOne
	@JoinColumn(name = "ZonaEleitoralId")
	private ZonaEleitoral ZonaEleitoral;
		
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Eleitor getEleitor() {
		return Eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		Eleitor = eleitor;
	}

	public Candidato getCandidato() {
		return Candidato;
	}

	public void setCandidato(Candidato candidato) {
		Candidato = candidato;
	}

	public ZonaEleitoral getZonaEleitoral() {
		return ZonaEleitoral;
	}

	public void setZonaEleitoral(ZonaEleitoral zonaEleitoral) {
		ZonaEleitoral = zonaEleitoral;
	}
	
	
	

}
