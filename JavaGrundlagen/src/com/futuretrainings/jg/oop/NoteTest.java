package com.futuretrainings.jg.oop;

public class NoteTest {
	public static void main(String[] args) {
		for (Note n : Note.values()) {
			System.out.println(n + ": " + n.getPunkte());
		}

		System.out.println("50 Punkte: " + Note.getNote(50));
		System.out.println("82 Punkte: " + Note.getNote(82));
	}
}
