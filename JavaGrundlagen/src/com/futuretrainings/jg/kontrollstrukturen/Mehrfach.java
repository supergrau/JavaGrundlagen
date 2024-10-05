package com.futuretrainings.jg.kontrollstrukturen;

public class Mehrfach {
	public static void main(String[] args) {
		int zensur = 1;
		String ergebnis = "";
		
		switch (zensur) {
		case 1:
			ergebnis = "sehr gut";
			break;
		case 2:
			ergebnis = "gut";
			break;
		case 3:
			ergebnis = "befriedigend";
			break;
		case 4:
			ergebnis = "ausreichend";
			break;
		case 5:
			ergebnis = "mangelhaft";
			break;
		case 6:
			ergebnis = "ungenügend";
			break;
		default:
			ergebnis = "keine Angabe";
		}
		
		System.out.println(ergebnis);
	}

}
