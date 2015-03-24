package com.alura.designpatterns.chain;

import com.alura.designpatterns.Orcamento;

public class SemDesconto implements Desconto {

    public double calcula(Orcamento orcamento) {
        return 0;
    }

    public void proximo(Desconto desconto) {
        // nao tem!
    }

}