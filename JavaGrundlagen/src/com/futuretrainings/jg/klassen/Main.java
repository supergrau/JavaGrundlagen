package com.futuretrainings.jg.klassen;

public class Main {

	public static void main(String[] args) {
		Greeter greet = new Greeter(); // greet: Instanz bzw ein Objekt der Klasse Greeter
		
		System.out.println(greet.greet());
		
		System.out.println(Greeter.staticGreet());
		System.out.println(Greeter.userGreet("micha "));
		System.out.println(Greeter.userGreet("micha", 64));

		
	}

}
