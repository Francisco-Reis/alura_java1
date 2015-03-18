import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Programa1 {
	public static void main(String[] args) throws IOException {
//		InputStream fileInputStream = new FileInputStream("arquivo1.txt"); // System.in;
//		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//		BufferedReader bf = new BufferedReader(inputStreamReader);
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("retorno.txt")));
		
		
		System.out.println("Digite sua mensagem:");
		String readLine = bf.readLine();
		
		while(readLine != null){  // !readLine.equals("exit")){
//			System.out.println(readLine);
			bw.append(readLine);
			bw.newLine();
			readLine = bf.readLine();
		}
		
		bf.close();
		bw.close();
	}
}
