
public class IteraString {
	public static void main(String[] args) {
		String nome = "Francisco";
		for(int i = 0; i < nome.length(); i++){
			System.out.println(nome.charAt(i));
		}
		System.out.println(new StringBuilder(nome).reverse());
		
		int x;
		
		x = Integer.parseInt("234");
		System.out.println(x);
	}
}
