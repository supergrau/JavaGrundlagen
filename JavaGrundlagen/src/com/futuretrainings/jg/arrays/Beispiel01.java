package com.futuretrainings.jg.arrays;

import java.awt.*;

public class Beispiel01 {
	public static void main(String[] args) {
		int wert1, wert2, wert3, wert4;
		wert1 = 1;
		wert2 = 2;
		wert3 = 6;
		wert4 = 17;

		// Besser ein Array erzeugen:
		int[] werte = new int[4];

		for (int i = 0; i < werte.length; i++) {
			werte[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < werte.length; i++) {
			System.out.printf("%d\n", werte[i]);
		}

		Point[] punkte = { new Point(1, 2), new Point(3, 4), new Point(5, 6) };
		for (Point p : punkte) {
			System.out.println(p);
		}
		System.out.println();
		System.out.println(punkte[1]);

		int[][] zweidim = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 }, { 41, 42, 43 }, { 51, 52, 53 } };
		for (int i = 0; i < zweidim.length; i++) {
			for (int j = 0; j < zweidim[0].length; j++) {
				System.out.printf("i=%d: j=%d   %d ", i, j, zweidim[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		Point[][] points = { 
						     { new Point(1,1), new Point(1,2) }, 
						     { new Point(2,1), new Point(2,2) }, 
						     { new Point(3,1), new Point(3,2) }, 
						     { new Point(4,1), new Point(4,2) }, 
						   };
		
		for(Point[] ps: points) {
			for(Point p: ps) {
				System.out.print(p + "   ");
			}
			System.out.println();
		}
		Point[][][] points3 = { 
			     { {new Point(11,1), new Point(12,2)}, {new Point(21,1), new Point(22,2)} }, 
			     { {new Point(31,1), new Point(32,2)}, {new Point(41,1), new Point(42,2)} }, 
			     { {new Point(51,1), new Point(52,2)}, {new Point(61,1), new Point(62,2)} }, 
			     { {new Point(71,1), new Point(72,2)}, {new Point(81,1), new Point(82,2)} }, 
			   };
		for(Point[][] ps2: points3) {
			for(Point[] ps1: ps2) {
				for (Point p:ps1) {
					System.out.print(p + "   ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
