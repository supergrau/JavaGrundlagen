package com.futuretrainings.jg.aufgaben.oop;

public class Azubi extends Mitarbeiter {
	private int abgelegtePruefungen;

	public Azubi(String nachname, String vorname, double gehalt) {
		super(nachname, vorname, gehalt);
	}

	public void setPruefungen(int anzahl) {
		abgelegtePruefungen = anzahl;
	}

	public void zeigeDaten() {
		System.out.println("LEHRLING");
		super.zeigeDaten();
		System.out.println("abgelegte Prüfungen: " + abgelegtePruefungen);
		System.out.println();
	}

	public void addZulage(double betrag) {
		if (abgelegtePruefungen > 3)
			gehalt += betrag;
	}
}
