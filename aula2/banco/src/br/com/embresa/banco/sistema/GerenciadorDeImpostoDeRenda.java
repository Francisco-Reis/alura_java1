package br.com.embresa.banco.sistema;

import br.com.embresa.banco.conta.Tributavel;

public class GerenciadorDeImpostoDeRenda {
    private double total;

    public void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);

        this.total +=  t.calculaTributos();
    }

    public double getTotal() {
        return this.total;
    }
}
