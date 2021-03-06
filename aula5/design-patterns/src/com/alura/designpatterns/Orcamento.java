package com.alura.designpatterns;

import java.util.ArrayList;
import java.util.List;

import com.alura.designpatterns.strategy.Item;


public class Orcamento {

	private double valor;
	private List<Item> itens;
	
	public Orcamento(double valor) {
		super();
		this.valor = valor;
		this.itens = new ArrayList<>();
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public double getValor() {
		return valor;
	}

}
