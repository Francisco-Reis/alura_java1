package com.alura.designpatterns.chain;

import com.alura.designpatterns.Conta;

public class Porcento implements Resposta {

	private Resposta resp;
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.PORCENTO)){
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());	
		} else {
			this.resp.responde(req, conta);
		}

	}

	@Override
	public void setProxima(Resposta resposta) {
		// sem retorno

	}

	public Porcento(Resposta resp) {
		super();
		this.resp = resp;
	}

}
