package com.futuretrainings.jg.aufgaben.imperativ;

public class Aufgabe06 {

	public static void main(String[] args) {
		int h = 10;
		int b = 3;

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h - i; j++) {
				for (int k = 1; k <= b; k++) {
					System.out.print(" ");
				}
			}
			
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= b; k++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}

	}

}
