package com.futuretrainings.jg.aufgaben.oop.sparbuch;

public class Utilities {
	private static int counter;

	public static void zeige(Anzeigbar a) {
		System.out.println("LFD. NR.: " + ++counter);
		a.zeige();
		System.out.println();
	}
}
