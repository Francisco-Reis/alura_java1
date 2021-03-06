package br.com.embresa.banco;

import java.util.HashSet;
import java.util.Set;

import br.com.embresa.banco.conta.Conta;
import br.com.embresa.banco.conta.ContaPoupanca;

public class TestaHashSet {
	
	public static void main(String[] args) {
		
		Set<Conta> contas = new HashSet<Conta>();
		
		contas.add(new ContaPoupanca(23,"Fabio",1321));
		contas.add(new ContaPoupanca(23,"Fabio",345646));
		contas.add(new ContaPoupanca(23,"Lucio",123456));
		contas.add(new ContaPoupanca(26,"Renato",3478340));
		
		System.out.println(contas);
	}
}
