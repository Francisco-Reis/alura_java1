package br.com.embresa.banco;

import br.com.embresa.banco.conta.Conta;
import br.com.embresa.banco.conta.ContaCorrente;
import br.com.embresa.banco.conta.ContaPoupanca;
import br.com.embresa.banco.sistema.AtualizadorDeContas;

public class TestaContas {
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
//		ContaCorrente cc = new ContaCorrente();
//		ContaPoupanca cp = new ContaPoupanca();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000); 
		cc.deposita(1000); 
		cp.deposita(1000);

//		c.atualiza(0.01);
//		cc.atualiza(0.01);
//		cp.atualiza(0.01);

		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.printf("Saldo Total: %.2f", adc.getSaldoTotal());
		
	}
}