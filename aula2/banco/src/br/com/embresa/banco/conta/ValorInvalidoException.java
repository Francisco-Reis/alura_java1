package br.com.embresa.banco.conta;

public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
