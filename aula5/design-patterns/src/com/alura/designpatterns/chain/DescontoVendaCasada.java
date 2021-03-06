package com.alura.designpatterns.chain;

import java.util.List;

import com.alura.designpatterns.Orcamento;
import com.alura.designpatterns.strategy.Item;

public class DescontoVendaCasada implements Desconto {

	private Desconto desc;
	
	@Override
	public double calcula(Orcamento orcamento) {
		List<Item> itens = orcamento.getItens();
		if(itens.contains("LAPIS") && itens.contains("CANETA")) {
			return orcamento.getValor() * 0.05;
		} else {
			return this.desc.calcula(orcamento);
		}
	}

	@Override
	public void proximo(Desconto d) {
		this.desc = d;

	}

}
