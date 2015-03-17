package br.com.embresa.banco.sistema;

import br.com.embresa.banco.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.printf("Saldo anterior: %.2f\n", c.getSaldo());
		c.atualiza(this.selic);
		System.out.printf("Saldo final: %.2f\n", c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal(){
		return this.saldoTotal;
	}
	
	public double getSelic() {
		return selic;
	}
}
