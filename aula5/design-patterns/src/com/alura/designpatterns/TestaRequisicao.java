package com.alura.designpatterns;

import com.alura.designpatterns.chain.CSV;
import com.alura.designpatterns.chain.Formato;
import com.alura.designpatterns.chain.Porcento;
import com.alura.designpatterns.chain.Requisicao;
import com.alura.designpatterns.chain.Resposta;
import com.alura.designpatterns.chain.XML;

public class TestaRequisicao {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(4000);
		conta.setTitular("Francisco");
		
		Requisicao req = new Requisicao(Formato.PORCENTO);
		
		Resposta r0 = new Porcento(null);
		Resposta r1 = new XML(r0);
		Resposta r2 = new CSV(r1);
		
		r2.responde(req, conta);
		
		
	}
}
