package com.alura.designpatterns.strategy;

import com.alura.designpatterns.Orcamento;

public abstract class TemplateImposto implements Imposto {
    public double calcula(Orcamento orcamento) {

        if(deveUsarMaximaTaxacao(orcamento)) {
          return maximaTaxacao(orcamento);
        } else {
          return minimaTaxacao(orcamento);
        }

      }

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

  }
