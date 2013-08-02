package com.treinamento.tictactoe;

import java.io.Serializable;

public class Game implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String jogador1;
	private String jogador2;
	private Integer vitoriasJogador1;
	private Integer VitoriasJogador2;
	private Integer partidasJogadas;
	
	public String getJogador1() {
		return jogador1;
	}
	public void setJogador1(String jogador1) {
		this.jogador1 = jogador1;
	}
	public String getJogador2() {
		return jogador2;
	}
	public void setJogador2(String jogador2) {
		this.jogador2 = jogador2;
	}
	public Integer getVitoriasJogador1() {
		return vitoriasJogador1;
	}
	public void setVitoriasJogador1(Integer vitoriasJogador1) {
		this.vitoriasJogador1 = vitoriasJogador1;
	}
	public Integer getVitoriasJogador2() {
		return VitoriasJogador2;
	}
	public void setVitoriasJogador2(Integer vitoriasJogador2) {
		VitoriasJogador2 = vitoriasJogador2;
	}
	public Integer getPartidasJogadas() {
		return partidasJogadas;
	}
	public void setPartidasJogadas(Integer partidasJogadas) {
		this.partidasJogadas = partidasJogadas;
	}
	
}
