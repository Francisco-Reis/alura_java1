package com.alura.designpatterns.chain;

import com.alura.designpatterns.Orcamento;

public class DescontoQuinhentos implements Desconto {
    private Desconto proximo;

    public void proximo(Desconto proximo) {
      this.proximo = proximo;
    }

    public double calcula(Orcamento orcamento) {
      if(orcamento.getValor() > 500) {
        return orcamento.getValor() * 0.07;
      }
      else {
        return proximo.calcula(orcamento);
      }
    }
  }