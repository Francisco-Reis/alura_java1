public class TestePrograma2 {
	public static void main(String[] args) {

		Programa2 p1 = new Programa2();
		p1.setId(1);

		Thread t1 = new Thread(p1);
		t1.start();

		Programa2 p2 = new Programa2();
		p2.setId(2);

		Thread t2 = new Thread(p2);
		t2.start();
		
		Linha l = new Linha();
		
		Thread t3 = new Thread(l);
		t3.start();

	}
}