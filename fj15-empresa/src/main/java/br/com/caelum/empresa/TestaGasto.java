package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class TestaGasto {

	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1985, 12, 23);
		Funcionario f = new Funcionario("Jo�o", 2, dataNascimento);

		Gasto g1 = new Gasto(230.00, "tenis", f, Calendar.getInstance(), false);
		Gasto g2 = new Gasto(1100.00, "smartphone", f, Calendar.getInstance(),
				false);
		Gasto g3 = new Gasto(15.00, "lanche", f, Calendar.getInstance(), true);

		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
	}
}
