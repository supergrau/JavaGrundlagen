package com.futuretrainings.jg.oop.vererbung;

import java.util.ArrayList;
import java.util.List;

public class Polymorphismus {

	public static void main(String[] args) {
		Object object;
		Kunde kunde = new Kunde();
		
		object = kunde;
		
		// Boxing und Unboxing
		
		Object object1;
		int i = 10;
		object1 = i;  // Auto-Boxing-> der Wert 10 wird automatisch auf den HEAP gelegt
		i = 22;
		
		System.out.println(i);
		System.out.println(object1);
		object1 = 34;
		System.out.println(object1);
		System.out.println(i);
		
		int j = (int)object1;  // Unboxing
		System.out.println(j);
		
		// Wrapperklassen
		Integer varI;
		varI = i;  // Autoboxing
		
		Integer varJ = new Integer(j);  // Explizites Boxing
		System.out.println(varJ);
		
		Person person = new Person();
		Mitarbeiter mitarbeiter = new Mitarbeiter();
		
		person = kunde;
		person = mitarbeiter;
		
//		kunde = mitarbeiter;
//		mitarbeiter = person;
		
		Angesteller angestellter = new Angesteller();
		mitarbeiter = angestellter;
		
		List<Person> liste = new ArrayList<>();
		liste.add(new Angesteller());
		liste.add(new Mitarbeiter());
		liste.add(new Kunde());
		liste.add(new Person());
		liste.add(new Angesteller());
		liste.add(new Angesteller());
		liste.add(new Kunde());

		for (Person p : liste) {
			System.out.println(p.greet());
		}
	}

}
