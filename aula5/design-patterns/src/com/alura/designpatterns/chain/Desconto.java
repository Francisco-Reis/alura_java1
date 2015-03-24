package com.alura.designpatterns.chain;

import com.alura.designpatterns.Orcamento;

public interface Desconto {

	public double calcula(Orcamento orcamento);
	
	public void proximo(Desconto d);
}
