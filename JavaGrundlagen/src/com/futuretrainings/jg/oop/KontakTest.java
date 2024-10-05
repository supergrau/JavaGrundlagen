package com.futuretrainings.jg.oop;

public class KontakTest {

	public static void main(String[] args) {
		Kontakt muster = new Kontakt();
		muster.setName("Muster");
		
		Kontakt lehmann = new Kontakt("Lehmann");
		
		Kontakt mueller = new Kontakt("Müller", "0123456789");
		
//		System.out.println("Name: " + muster.getName() + " Telefon: " + muster.getTelefon());
//		System.out.println("Name: " + lehmann.getName() + " Telefon: " + lehmann.getTelefon());
//		System.out.println("Name: " + mueller.getName() + " Telefon: " + mueller.getTelefon());
		
		String info = muster.toString();
		
		System.out.println(info);
		System.out.println(lehmann);
		System.out.println(mueller);
		
		System.out.println("Anzahl Kontakte: " + Kontakt.getCounter());
		
		// muster.finalize();
		muster = null;
		System.gc(); // Aufruf der Garbage Collection
		System.out.println(muster);
		
		System.out.println(Vorwahl.zoerbig);
		

	}

}
