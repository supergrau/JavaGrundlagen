package com.futuretrainings.jg.oop.vererbung.interfaces;

// package com.futuretrainings.jg.oop.vererbung.interfaces;

public class Schnittstellen {

	public static void main(String[] args) {
		System.out.println("Hallo Welt");
		IEingebbar conE = new Konsolenprogramm();
		IAusgebbar conA = new Konsolenprogramm();
		Konsolenprogramm con = new Konsolenprogramm();
		
		
		
		Object eingabe = conE.eingeben();
		
		conA.ausgeben(eingabe);
		
		eingabe = con.eingeben();
		con.ausgeben(eingabe);
	}

}
