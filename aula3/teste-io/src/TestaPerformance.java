import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

        public static void main(String[] args) {
            System.out.println("Iniciando...");
            Collection<Integer> teste = new HashSet<>();
            long inicio = System.currentTimeMillis();

            int total = 30000;

            for (int i = 0; i < total; i++) {
                teste.add(i);
            }

            long parcial = System.currentTimeMillis();
            
            for (int i = 0; i < total; i++) {
                teste.contains(i);
            }

            long fim = System.currentTimeMillis();
            
            long seta = parcial - inicio;
            long busca = fim - parcial;
            long tempo = fim - inicio;
            
            System.out.println("Primeiro bloco : " + seta);
            System.out.println("Segundo bloco  : " + busca);
            System.out.println("Tempo total    : " + tempo);
        }
    }