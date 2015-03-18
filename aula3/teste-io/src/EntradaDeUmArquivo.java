import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class EntradaDeUmArquivo {
        public static void main(String[] args) throws IOException {
            InputStream is = System.in; //new FileInputStream("arquivo1.txt");
            Scanner entrada = new Scanner(is);
            
            PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
            
            System.out.println("Digite sua mensagem:");
            while (entrada.hasNextLine()) {
//                System.out.println(entrada.nextLine());
                saida.println(entrada.nextLine());
            }
            entrada.close();
            saida.close();
        }
    }