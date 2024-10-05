package com.futuretrainings.jg.oop.vererbung;

public class Kunde extends Person {

	private int kundenID;
	
	public Kunde() {
		super();  // Standarkonstruktor de Basisklasse explizit aufrufen
		this.kundenID = 0;
	}

	public Kunde(String name, int kundenID) {
		// Aufruf des Basisklassenkonstruktors
		super(name);
		this.kundenID = kundenID;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + " - Kunden-ID: " + this.kundenID;
	}
	
	@Override
	public String greet() {
		return "Hallo Kunde";
	}

}
