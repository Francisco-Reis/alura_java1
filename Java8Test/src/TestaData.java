import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class TestaData {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate futuro = LocalDate.of(2099, 1, 25);
		System.out.println(futuro);
	
		Period diferenca = Period.between(hoje, futuro);
		System.out.println(diferenca.getYears());
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(format));
	}
}
