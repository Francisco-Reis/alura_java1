package com.alura.designpatterns.chain;

public class Requisicao {
	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}

	// getter para o Formato
}