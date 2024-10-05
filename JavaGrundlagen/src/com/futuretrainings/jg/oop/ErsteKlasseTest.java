package com.futuretrainings.jg.oop;

import java.awt.Point;

public class ErsteKlasseTest {

	public static void main(String[] args) {
		ErsteKlasse ek = new ErsteKlasse();

		System.out.println(ek.getName());
		
		ek.x = 123;
		System.out.println("x = " + ek.x);
		System.out.println(ek.toString());
		
		ErsteKlasse ek2 = new ErsteKlasse();
		System.out.println(ek2.toString());
		
		boolean b = ek.equals(ek2);
		System.out.println(b);
		ErsteKlasse ek3 = ek;
		b = ek.equals(ek3);
		System.out.println(b);
		System.out.println(ek3.toString());
		
		Point p1 = new Point(12,34);
		Point p2 = new Point(p1);
		Point p3 = p1;
		p2.x = 123;
		p3.x = 456;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
