package com.alura.designpatterns.strategy;
import com.alura.designpatterns.Orcamento;


public interface Imposto {

	public double calcula(Orcamento o);
}
