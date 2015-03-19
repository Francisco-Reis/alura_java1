package br.com.embresa.banco.conta;

import java.util.Map;

public class Banco {
	
	private Map<String, Conta> contas;
	
	public void acidiona(Conta c){
		this.contas.put(c.getNome(),c);
	}
	
//	public Conta pega(int x){
//		return this.contas.get(x);
//	}
	
	public int pegaQuantidadeDeContas(){
		return this.contas.size();
	}
	
	public Conta buscaPorNome(String nome){
		return this.contas.get(nome);
	}
}
