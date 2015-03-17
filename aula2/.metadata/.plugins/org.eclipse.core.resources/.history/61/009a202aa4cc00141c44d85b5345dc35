package banco;

public abstract class Conta {
	protected double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor){
		if (valor > 0) {
			this.saldo += valor;
		} else {
			throw new ValorInvalidoException("Valor deve ser maior que zero");
		}
	}
	
	public void saca(double valor){
		if (valor <= this.saldo) this.saldo -= valor;
	}
	
	public abstract void atualiza(double taxa);
	
}