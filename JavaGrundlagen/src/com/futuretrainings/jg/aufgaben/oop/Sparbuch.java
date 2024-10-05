package com.futuretrainings.jg.aufgaben.oop;

public class Sparbuch {
	private int kontonummer;
	private double kapital;
	private double zinssatz;

	public Sparbuch(int kontonummer, double kapital, double zinssatz) {
		this.kontonummer = kontonummer;
		this.kapital = kapital;
		this.zinssatz = zinssatz;
	}

	public void zahleEin(double betrag) {
		kapital += betrag;
	}

	public void hebeAb(double betrag) {
		kapital -= betrag;
	}

	public double getErtrag(int laufzeit) {
		double p = 1 + zinssatz / 100;
		double q = 1;

		for (int i = 0; i < laufzeit; i++)
			q *= p;

		return kapital * q;
	}

	public void verzinse() {
		kapital *= 1 + zinssatz / 100;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public double getKapital() {
		return kapital;
	}

	public double getZinssatz() {
		return zinssatz;
	}
}
