package com.futuretrainings.jg;

import java.awt.Point;

/**
 * @author Ich
 * @version 1.0
 * Meine erste Klasse
 */
public class Application {

	/**
	 * Der Einsprungspunkt in das Programm
	 * @param args  Kommandozeilenargumente
	 */
	public static void main(String[] args) {
		int i = 11;  			// i ist keine Referencvariable
		int j = i;
		
		System.out.println("Hallo Welt");
		long kontoStand = 23L;
		byte b = (byte) -127;
		System.out.println(b);
		String s = "Test";    // Deklaration
		System.out.printf("s: %s\n", s);
		s = "Hallo"; // Initialisierung
		int zahl = 1; 
		System.out.println("zahl: " + zahl);
		zahl = 10;
		System.out.println("zahl: " + zahl);
		System.out.println("i: " + i + " j: " + j);
		j = 43;
		System.out.println("i: " + i + " j: " + j);

		Point p = new Point();  // p ist eine Referenz-Variable die auf den Heap-Speicher verweist
		
/*
					  +-------+
                      | Point |
+-----+               | ----- |
|  p  +-------------->+-------+
+-----+               | x=0   |
                      | y=0   |
                      +-------+
*/
		Point q = p;
		
		   /*
        			  +-------+
        			  | Point |
+-----+               | ----- |               +-----+
|  p  +-------------->+-------+<--------------+  q  |
+-----+               | x=0   |               +-----+
        			  | y=0   |
        			  +-------+
*/
		
		q.x = 10; q.y = 20;
		System.out.println(p);
		System.out.println(q);
		
		clearPoint(p);
		System.out.println(p);
		System.out.println(q);
		//p = null; q = null;
		clearInt(i);
		System.out.println("i: " + i);
		float luftdruck = 1234.0F;
		
		boolean wahrheit = i <= j;
		
		System.out.println( Long.MAX_VALUE ); // 9223372036854775807

		double d = Long.MAX_VALUE;

		System.out.printf( "%.0f%n", d );     // 9223372036854776000

		System.out.println( (long) d );       // 9223372036854775807
		
		System.out.println( String.valueOf('A') + String.valueOf('a') ); 
		System.out.println( 'A' + 'a' ); 
	}
	
	/**
	 * Setzt die Punktkoordinaten auf 0
	 * @param p ein Punkt
	 */
	public static void clearPoint(Point p) {
		p.x = p.y = 0; 
	}
	
	/**
	 * i wird als Wertkopie übergeben (call by value), nicht als Referenz (call by refence)
	 * @param i ein int
	 */
	public static void clearInt(int i) {
		i = 0;
	}
}
