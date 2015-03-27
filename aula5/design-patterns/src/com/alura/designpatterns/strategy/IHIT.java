package com.alura.designpatterns.strategy;

import java.util.HashSet;
import java.util.Set;

import com.alura.designpatterns.Orcamento;

public class IHIT extends TemplateImposto {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {

		Set<String> nomes = new HashSet<>();
		
		for(Item i : orcamento.getItens()){
			nomes.add(i.getNome());
		}
		
		return nomes.size() != orcamento.getItens().size();
	}

}
