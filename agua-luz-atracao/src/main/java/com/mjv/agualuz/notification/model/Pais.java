package com.mjv.agualuz.notification.model;

public enum Pais {
	BRASIL("BR"),
	ESTADOS_UNIDOS("US"),
	FRANÇA("FR");
	
	private String sigla;
	
	private Pais(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
}
