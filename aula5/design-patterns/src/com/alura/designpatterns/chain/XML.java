package com.alura.designpatterns.chain;

import com.alura.designpatterns.Conta;

public class XML implements Resposta {

	private Resposta resp;
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.XML)){
			System.out.println("<conta>"
					+ "<titular>" + conta.getTitular() + "</titular>"
					+ "<saldo>" + conta.getSaldo() + "</saldo>");	
		} else {
			this.resp.responde(req, conta);
		}

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resp = resposta;

	}

	public XML(Resposta resp) {
		super();
		this.resp = resp;
	}

}
