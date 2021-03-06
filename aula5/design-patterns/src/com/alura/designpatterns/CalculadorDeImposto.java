package com.alura.designpatterns;

import java.util.ArrayList;
import java.util.List;

import com.alura.designpatterns.strategy.ICCC;
import com.alura.designpatterns.strategy.ICMS;
import com.alura.designpatterns.strategy.ICPP;
import com.alura.designpatterns.strategy.IHIT;
import com.alura.designpatterns.strategy.IKCV;
import com.alura.designpatterns.strategy.ISS;
import com.alura.designpatterns.strategy.Imposto;
import com.alura.designpatterns.strategy.Item;


public class CalculadorDeImposto {

	public static void main(String[] args) {
		Orcamento orc = new Orcamento(4000.0);
		
		List<Item> itens = new ArrayList<>();
		
		itens.add(new Item("PC",2900));
		itens.add(new Item("Smartphone",1000));
		itens.add(new Item("LAPIS",100));
		
		orc.setItens(itens);
		
		double icms = calculaImposto(orc, new ICMS());
		System.out.println("ICMS: " + icms);
		
		double iss = calculaImposto(orc, new ISS());
		System.out.println("ISS:  " + iss);
		
		double iccc = calculaImposto(orc, new ICCC());
		System.out.println("ICCC: " + iccc);
		
		double icpp = calculaImposto(orc, new ICPP());
		System.out.println("ICPP: " + icpp);
		
		double ikcv = calculaImposto(orc, new IKCV());
		System.out.println("IKCV: " + ikcv);
		
		double ihit = calculaImposto(orc, new IHIT());
		System.out.println("IHIT: " + ihit);
		
	}
	
	public static double calculaImposto(Orcamento orc, Imposto imp){
		return imp.calcula(orc);
	}
}
