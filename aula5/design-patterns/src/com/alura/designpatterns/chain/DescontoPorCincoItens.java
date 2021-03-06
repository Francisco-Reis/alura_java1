package com.alura.designpatterns.chain;

import com.alura.designpatterns.Orcamento;

public class DescontoPorCincoItens implements Desconto {
    private Desconto proximo;

    public void proximo(Desconto proximo) {
      this.proximo = proximo;
    }

    public double calcula(Orcamento orcamento) {
      if(orcamento.getItens().size() > 5) {
        return orcamento.getValor() * 0.1;
      }
      else {
        return proximo.calcula(orcamento);
      }
    }
  }