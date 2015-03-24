package com.alura.designpatterns.chain;

import com.alura.designpatterns.Conta;

public class CSV implements Resposta {

	public CSV(Resposta resp) {
		super();
		this.resp = resp;
	}

	private Resposta resp;
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.CSV)){
			System.out.println(conta.getTitular() + ";" + conta.getSaldo());	
		} else {
			this.resp.responde(req, conta);
		}

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resp = resposta;

	}

}
