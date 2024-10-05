package com.futuretrainings.jg.aufgaben.oop;

public class Angestellter extends Mitarbeiter {
	private static final int MAX_STUFE = 5;
	private int stufe;

	public Angestellter(String nachname, String vorname, double gehalt) {
		super(nachname, vorname, gehalt);
	}

	public void befoerdere() {
		if (stufe < MAX_STUFE)
			stufe++;
	}

	public void zeigeDaten() {
		System.out.println("ANGESTELLTER");
		super.zeigeDaten();
		System.out.println("Stufe: " + stufe);
		System.out.println();
	}

	public void addZulage(double betrag) {
		if (stufe > 1)
			gehalt += betrag;
	}
}

