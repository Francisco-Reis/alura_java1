package br.com.embresa.banco.conta;

public abstract class Conta {
	protected double saldo;
	protected int numero;
	private String nome;
	
	public Conta(){};
	
	public Conta(int numero, String nome, double saldo) {
		this.saldo = saldo;
		this.numero = numero;
		this.nome = nome;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) throws ValorInvalidoException{
		if (valor > 0) {
			this.saldo += valor;
		} else {
			throw new ValorInvalidoException(valor);
		}
	}
	
	public void saca(double valor){
		if (valor <= this.saldo) this.saldo -= valor;
	}
	
	public abstract void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "Conta com saldo: " + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;

        return this.numero == outraConta.numero
            && this.nome == outraConta.nome;
	}
	
}