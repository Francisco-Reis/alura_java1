package br.com.embresa.banco;

import br.com.embresa.banco.conta.Conta;
import br.com.embresa.banco.conta.ContaCorrente;
import br.com.embresa.banco.conta.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		// testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		System.out.println(((Conta) t).getSaldo());
	}
}
