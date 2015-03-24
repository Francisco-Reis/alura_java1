package com.alura.designpatterns.strategy;
import com.alura.designpatterns.Conta;

public class Conservador implements Investimento {
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
}