package com.futuretrainings.jg.aufgaben.oop;

public class MitarbeiterTest {

	public static void main(String[] args) {
		Azubi einAzubi = new Azubi("Schmitz", "Hugo", 1500.);
		Angestellter einAngestellter = new Angestellter("Schulze", "Erwin",	6000.);

		einAzubi.zeigeDaten();
		einAngestellter.zeigeDaten();

		einAzubi.setPruefungen(5);
		einAzubi.addZulage(100);
		einAngestellter.befoerdere();
		einAngestellter.erhoeheGehalt(500.);
		einAngestellter.befoerdere();
		einAngestellter.erhoeheGehalt(600.);
		einAngestellter.addZulage(200);

		einAzubi.zeigeDaten();
		einAngestellter.zeigeDaten();

	}

}
