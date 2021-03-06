package br.com.embresa.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.embresa.banco.conta.Conta;
import br.com.embresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {
	
	public static void main(String[] args) {
		
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i ++){
			contas.add(new ContaPoupanca(rand.nextInt(10000),"",rand.nextDouble()));
		}
		
		Collections.sort(contas);
		
		System.out.println(contas);
		
		for(Conta c: contas){
			System.out.println(c.getNumero() + ":" + c.getSaldo());			
		}
		
	}
}
