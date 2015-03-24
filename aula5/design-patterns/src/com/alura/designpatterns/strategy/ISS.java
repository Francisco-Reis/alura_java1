package com.alura.designpatterns.strategy;
import com.alura.designpatterns.Orcamento;


public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento o) {
		return o.getValor() * 0.06;
	}

}
