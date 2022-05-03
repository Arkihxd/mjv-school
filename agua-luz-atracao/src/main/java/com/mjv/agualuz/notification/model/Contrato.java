package com.mjv.agualuz.notification.model;

import java.time.LocalDateTime;

public class Contrato {
	private Cadastro cliente;
	private Servico servico;
	private Double valor;
	private LocalDateTime dataHora;
	private Long numeroProtocolo;
	private TipoNotificacao tipoNotificacao;
	
	
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}
	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
		this.valor = servico.getValor();
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Long getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(Long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	
}
