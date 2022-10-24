package loopDemo;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}
		System.out.println("Döngü bitti.");

		for (int i = 1; i < 10; i += 2) {

			System.out.println(i);
		}
		System.out.println("Tek sayılar döngüsü bitti.");

		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Çift sayılar döngüsü bitti");
		System.out.println("-------------------");
	
		int i=1;
		while(i<10) {
			i+=2;
			System.out.println(i);
			
		}
		
		System.out.println("-------------------");
		
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		
		
		
	
	
	
	
	
	
	}

}
