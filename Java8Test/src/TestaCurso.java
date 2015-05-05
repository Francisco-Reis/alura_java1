import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestaCurso {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream().mapToDouble(Curso::getAlunos).average();
		
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.collect(Collectors.toList());
		
		Stream<String> cursoNomes = cursos.stream().map(Curso::getNome); 
	}
}
