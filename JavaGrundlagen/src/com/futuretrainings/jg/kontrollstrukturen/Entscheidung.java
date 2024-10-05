package com.futuretrainings.jg.kontrollstrukturen;

import javax.swing.JOptionPane;

public class Entscheidung {

	public static void main(String[] args) {
		// Eingabe: Zahl zwischen 1 und 100
		int eingabe = 0;
		eingabe = Integer.parseInt(JOptionPane.showInputDialog("Bitte einen Wert zwischen 1 und 100 eingeben"));
		
		// eingabe auswerten mit if:
//		if (eingabe < 1) {
//			JOptionPane.showMessageDialog(null, "Keine Zahl größer oder gleich 1 eingegeben (" + eingabe + ")");
//		}
//		else if(eingabe > 100) {
//			JOptionPane.showMessageDialog(null, "Keine Zahl kleiner oder gleich 100 eingegeben (" + eingabe + ")");
//		} 
//		else {
//			JOptionPane.showMessageDialog(null, "Perfekt! Deine Eingabe war: " + eingabe + "");
//		}
		
		// eine bessere Variante:
		if ((1 <= eingabe) && (eingabe <= 100)) {
			JOptionPane.showMessageDialog(null, "Perfekt! Deine Eingabe war: " + eingabe + "");			
		} 
		else {
			JOptionPane.showMessageDialog(null, "Fehler! Falsche Eingabe: " + eingabe + "");						
		}
	}

}
