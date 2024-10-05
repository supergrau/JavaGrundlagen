package com.futuretrainings.jg.aufgaben.oop;

public class SparbuchTest {

	public static void main(String[] args) {
		Sparbuch sb = new Sparbuch(4711, 1000, 3);

		sb.zahleEin(60000);
		System.out.println("Kapital: " + sb.getKapital());

		System.out.println("Ertrag nach 6 Jahr: " + sb.getErtrag(6));

		sb.verzinse();
		System.out.println("Kapital: " + sb.getKapital());
		

	}

}
