import java.util.ArrayList;
import java.util.Collections;


public class TestaTreeSet {

	public static void main(String[] args) {
		
//		TreeSet<Integer> mil = new TreeSet<>();
		ArrayList<Integer> mil = new ArrayList<>();
		
		
		for(int i = 0; i <= 1000; i++){
			mil.add(i);
		}
		
		Collections.sort(mil);
		Collections.reverse(mil);
		
//		for(Integer i: mil.descendingSet()){
		for(Integer i: mil){
			System.out.println(i);
		}
		
	}
	
}
