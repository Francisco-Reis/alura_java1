class Fatoriais1a10 {
	
	public static void main (String[] args) {
		
		int fatorial = 0;
		long result;
		
		for(int i = 1; i <= 30; i++) {
			result = i;
			fatorial = i;
			
			while(fatorial > 1) {
				result = result * (fatorial - 1);
				fatorial = fatorial - 1;
			}
			System.out.println("Fatorial de " + i + ": " + result);
		}
		
	}
	
}