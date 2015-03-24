package com.alura.designpatterns.chain;

import com.alura.designpatterns.Conta;

public interface Resposta {
	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);
}
