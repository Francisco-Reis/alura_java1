package com.alura.designpatterns;

import com.alura.designpatterns.chain.Desconto;
import com.alura.designpatterns.chain.DescontoPorCincoItens;
import com.alura.designpatterns.chain.DescontoQuinhentos;
import com.alura.designpatterns.chain.DescontoVendaCasada;
import com.alura.designpatterns.chain.SemDesconto;

public class TestaCorrente {
    public static void main(String[] args) {
      Desconto d1 = new DescontoPorCincoItens();
      Desconto d2 = new DescontoQuinhentos();
      Desconto d2_1 = new DescontoVendaCasada();
      Desconto d3 = new SemDesconto();

      d1.proximo(d2);
      d2.proximo(d2_1);
      d2_1.proximo(d3);

      Orcamento orcamento = new Orcamento(510.0);

      double desconto = d1.calcula(orcamento);
      System.out.println(desconto);
    }
  }