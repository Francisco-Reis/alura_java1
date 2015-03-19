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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
}