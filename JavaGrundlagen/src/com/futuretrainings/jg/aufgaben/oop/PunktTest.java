package com.futuretrainings.jg.aufgaben.oop;

public class PunktTest {

	public static void main(String[] args) {
		Punkt p1 = new Punkt();
		Punkt p2 = new Punkt(3,4);
		Punkt p3 = new Punkt(p2);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.printf("%5.4f", p2.abstand());
		

	}

}
