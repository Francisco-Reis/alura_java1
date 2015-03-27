package com.alura.designpatterns.strategy;

import com.alura.designpatterns.Orcamento;

public class IKCV extends TemplateImposto {

    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
      return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }
    public double maximaTaxacao(Orcamento orcamento) { 
      return orcamento.getValor() * 0.10;  
    }
    public double minimaTaxacao(Orcamento orcamento) {
      return orcamento.getValor() * 0.06;
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
    	for(Item item : orcamento.getItens()) {
            if(item.getValor() > 100) return true;
          }

          return false;
    }
	
  }
