package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1985, 3, 27);
		Funcionario funcionario = new Funcionario("Jos�", 25, dataNascimento);
		System.out.println(funcionario);
	}

}
