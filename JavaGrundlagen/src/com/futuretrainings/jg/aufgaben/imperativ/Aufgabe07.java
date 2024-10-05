package com.futuretrainings.jg.aufgaben.imperativ;

import java.io.*;

public class Aufgabe07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        double zahl1, zahl2, zahl3;
        double min, max;
        BufferedReader einlesen  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte die erste Zahl eingeben: ");
        zahl1 = Double.parseDouble(einlesen.readLine());

        System.out.println("Bitte die zweite Zahl eingeben: ");
        zahl2 = Double.parseDouble(einlesen.readLine());

        System.out.println("Bitte die dritte Zahl eingeben: ");
        zahl3 = Double.parseDouble(einlesen.readLine());

        min = zahl1;  //Das ist der Trick: einfach so tun, als wäre zahl1 das Min.
        max = zahl2;  //und zahl2 das Max. --> spart eine if-Anweisung   

        if (zahl1 > zahl2) {
            min = zahl2; 
            max = zahl1; 
        }

        if (max < zahl3) max = zahl3;

        if (zahl3 < min) min = zahl3;


        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
   
	}

}
