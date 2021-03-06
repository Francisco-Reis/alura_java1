package br.com.embresa.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<Conta>{
	
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, String nome, double saldo) {
		super(numero, nome, saldo);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.1;
	}

	@Override
	public int compareTo(Conta arg0) {
//		if(this.getNumero() < arg0.getNumero()) return -1;
//		if(this.getNumero() > arg0.getNumero()) return 1;
//		return 0;
		return this.getNome().compareTo(arg0.getNome());
	}
}