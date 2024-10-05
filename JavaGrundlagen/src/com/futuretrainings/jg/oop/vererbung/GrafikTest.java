package com.futuretrainings.jg.oop.vererbung;

public class GrafikTest {

	public static void main(String[] args) {
		Kreis kreis = new Kreis();
		Rechteck rechteck = new Rechteck();
		
		kreis.zeichnen();
		rechteck.zeichnen();
		kreis.info();
		
		Grafik grafik = new Kreis();
		grafik.info();
		grafik.zeichnen();

	}

}
