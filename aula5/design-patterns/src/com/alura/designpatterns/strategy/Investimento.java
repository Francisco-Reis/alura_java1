package com.alura.designpatterns.strategy;
import com.alura.designpatterns.Conta;

public interface Investimento {
	double calcula(Conta conta);
}