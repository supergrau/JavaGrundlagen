package com.futuretrainings.jg.kontrollstrukturen;

public class Schleifen {

	public static void main(String[] args) {
		// Kopfgesteuerte oder abweisende Schleife
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
			if(i==5) break;
		}
		
		// Fußgesteuerte oder nicht abweisende Schleife
		do {
			i--;
			System.out.println(i);
		} while(i > 0);
		
		// Zählschleife
		for ( i = 0; i < 10; i++ ) {
			System.out.println(i);			
		}
		
		int[] liste = { 0, 1, 2, 3, 4, 5, 6, 7 };
		
		for(int wert: liste) {
			System.out.println(wert);
		}
		
		System.out.println(liste.length);
	}

}
