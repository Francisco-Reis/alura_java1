
public class StringOperacoes {
	
	public static void main(String[] args) {
		String uma = "dentro";
		String outra = "Est� dentro da outra?";
		
		if (outra.contains(uma)) {	
			System.out.println("'uma' est� dentro da 'outra'");
		} else {
			System.out.println("'uma' n�o est� dentro da 'outra'");
		}
		
		String espacos = "    Espa�o     ";
		System.out.println("|" + espacos.trim() + "|");
		
		String vazia = "";
		if (vazia.isEmpty()){
			System.out.println("'vazia' est� vazia");
		} else {
			System.out.println("'vazia' n�o est� vazia");
		}
		
		String caracteres = "Francisco";
		System.out.println(caracteres.length());
	}
}
