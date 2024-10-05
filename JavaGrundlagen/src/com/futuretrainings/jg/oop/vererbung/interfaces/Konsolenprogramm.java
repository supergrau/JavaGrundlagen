package com.futuretrainings.jg.oop.vererbung.interfaces;

import java.util.Scanner;

public class Konsolenprogramm implements IAusgebbar, IEingebbar {

	@Override
	public Object eingeben() {
		Scanner einlesen = new Scanner(System.in); 
		System.out.print("Bitte eingeben: ");
		return (Object) (einlesen.nextLine());
	}

	@Override
	public void ausgeben(Object obj) {
		System.out.println("Inhalt: " + obj.toString());

	}

}
