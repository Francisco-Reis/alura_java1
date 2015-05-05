import java.util.function.Consumer;


public class ConsomeString implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
	

}
