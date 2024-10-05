package com.futuretrainings.jg.arrays;

public class StapelTest {

	public static void main(String[] args) {
		Stapel stapel = new Stapel();

		for (int i = 0; i < 20; i++) {
			stapel.push(100 + i);
		}

		for (int i = 0; i < 21; i++) {
			System.out.println(stapel.pop());
		}
	}

}
