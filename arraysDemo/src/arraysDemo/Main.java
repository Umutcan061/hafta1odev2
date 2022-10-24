package arraysDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Salih";
		ogrenciler[2] = "Derin";
		ogrenciler[3] = "Ahmet";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		for(String ogrenci:ogrenciler) {
			
		System.out.println(ogrenci);	
		}
	}

}
