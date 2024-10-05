package com.futuretrainings.jg.klassen;

public class Greeter {
	
	/**
	 * Eine einfache Begrüßung
	 */
//	public void greet() {
//		System.out.println("Herzlich willkommen");
//	}
	
	public String greet() {
		return Message.wellcome;
	}
	
	/**
	 * Auch eine Begrüßung; jedoch mit eine statischen Methode
	 */
//	public static void staticGreet() {
//		System.out.println("Eine statische Begrüßung");
//	}

	public static String staticGreet() {
		return Message.staticWellcome;
	}
	
	public static String userGreet(String user) {
		return "Willkommen im System, " + user;
	}
	
	public static String userGreet(String user, int age) {  // userGreet ist überladen
		return "Willkommen im System, " + user + " (" + age + ")";
	}
	
}
