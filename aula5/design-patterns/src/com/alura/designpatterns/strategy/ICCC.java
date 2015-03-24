package com.alura.designpatterns.strategy;
import com.alura.designpatterns.Orcamento;


public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento o) {
		if (o.getValor() < 1000){
			return o.getValor() * 0.05;
		} else if (o.getValor() >= 1000 && o.getValor() <= 3000){
			return o.getValor() * 0.07;
		} else {
			return o.getValor() * 0.08 + 30;
		}
		
	}

}
