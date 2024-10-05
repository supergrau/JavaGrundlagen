package com.futuretrainings.jg.oop;

public enum Note {
	SEHR_GUT(82, 90), 
	GUT(70, 81), 
	BEFRIEDIGEND(58, 69), 
	AUSREICHEND(46, 57), 
	MANGELHAFT(0, 45);

	private int von, bis;

	private Note(int von, int bis) {
		this.von = von;
		this.bis = bis;
	}

	public String getPunkte() {
		return von + " - " + bis;
	}

	public static Note getNote(int punkte) {
		Note result = null;
		for (Note n : Note.values()) {
			if (n.von <= punkte && punkte <= n.bis) {
				result = n;
				break;
			}
		}

		return result;
	}
}
