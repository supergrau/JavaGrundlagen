package com.futuretrainings.jg.oop.vererbung;

public class VererbungsTest {

	public static void main(String[] args) {
		Basis basis = new Basis();
		Erbe erbe = new Erbe();

		System.out.println(basis);
		System.out.println(erbe);
		
		// Ein Objekt der Klasse Kunde herstellen
		Kunde kunde = new Kunde("Muster", 12345);
		
		System.out.println(kunde);
		
		Person person = new Kunde("Peter", 12345);
		System.out.println(person);
		person.name = "Petra";
		System.out.println(person.getName());
		
		kunde.name = "";
		System.out.println(kunde);
		
		Mitarbeiter max = new Mitarbeiter("Max Muster", "Programmierung");
		System.out.println(max.getName());
		System.out.println(max.getAbteilung());
	}

}
