
public class StringOperacoes {
	
	public static void main(String[] args) {
		String uma = "dentro";
		String outra = "Está dentro da outra?";
		
		if (outra.contains(uma)) {	
			System.out.println("'uma' está dentro da 'outra'");
		} else {
			System.out.println("'uma' não está dentro da 'outra'");
		}
		
		String espacos = "    Espaço     ";
		System.out.println("|" + espacos.trim() + "|");
		
		String vazia = "";
		if (vazia.isEmpty()){
			System.out.println("'vazia' está vazia");
		} else {
			System.out.println("'vazia' não está vazia");
		}
		
		String caracteres = "Francisco";
		System.out.println(caracteres.length());
	}
}
