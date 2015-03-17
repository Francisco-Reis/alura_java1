package banco;

public abstract class Conta {
	protected double saldo;
	
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
	
}