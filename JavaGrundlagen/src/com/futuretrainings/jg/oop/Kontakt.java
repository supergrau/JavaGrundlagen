package com.futuretrainings.jg.oop;

/**
 * Beinhaltet die Daten für einen Kontakt
 */
public class Kontakt {
	
	// Instanz-Zähler
	private static int counter = 0;

	// Attribute:
	private String name;
	private String telefon;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	
	/**
	 * Der Standardkonstruktor initialisiert die Attribute mit
	 * n.a. (nicht angegeben)
	 */
	public Kontakt() {
		this.name = "n.a.";
		this.telefon = "n.a.";
		this.counter++;
	}
	
	/**
	 * Konstruktor, welcher einen Namen entgegen nimmt.
	 * @param name
	 */
	public Kontakt(String name) {
		this();
		this.name = name;
	}
	
	/**
	 * Kontruktor, welcher Name und Telefon entgegen nimmt.
	 * @param name
	 * @param telefon
	 */
	public Kontakt(String name, String telefon) {
		this(name);
		this.telefon = telefon;
	}
	
	public String toString() {
		return "Name: " + this.name + " Telefon: " + this.telefon;
	}
	
	public static int getCounter() {
		return counter;
	}

	protected void finalize() {
		System.out.println("Destruktor: " + this.name);
	}
}
