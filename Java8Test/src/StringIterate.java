import java.util.Arrays;
import java.util.List;


public class StringIterate {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("José", "Francisco", "Marcos", "Maria", "Ana");
		
//		Consumer<String> imprime = new ConsomeString();
		
		lista.forEach(s -> System.out.println(s));	
		
//		Comparator<String> porTamanho = new ComparaString();
		
//		lista.sort(Comparator.comparing(String::length));
		lista.sort(String.CASE_INSENSITIVE_ORDER);
		lista.forEach(System.out::println);	
		
	}
}
