package com.alura.designpatterns;

import com.alura.designpatterns.strategy.ICCC;
import com.alura.designpatterns.strategy.ICMS;
import com.alura.designpatterns.strategy.ISS;
import com.alura.designpatterns.strategy.Imposto;


public class CalculadorDeImposto {

	public static void main(String[] args) {
		Orcamento orc = new Orcamento(4000.0);
		
		double icms = calculaImposto(orc, new ICMS());
		System.out.println(icms);
		
		double iss = calculaImposto(orc, new ISS());
		System.out.println(iss);
		
		double iccc = calculaImposto(orc, new ICCC());
		System.out.println(iccc);
	}
	
	public static double calculaImposto(Orcamento orc, Imposto imp){
		return imp.calcula(orc);
	}
}
