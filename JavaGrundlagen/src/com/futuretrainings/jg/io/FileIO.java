package com.futuretrainings.jg.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws IOException {
		PrintWriter printSchreiben = new PrintWriter("java2.txt");
		
		printSchreiben.println("Maier;1111");
		printSchreiben.println("Muster;2222");
		printSchreiben.println("Lehmann;3333");
		printSchreiben.println("Schulze;4444");
		printSchreiben.println("Müller;5555");
		
		printSchreiben.close();
		
		// Lesen über den Scanner
		Scanner scanLesen = new Scanner( new FileReader("java2.txt"));
		
		while(scanLesen.hasNextLine()) {
			String s = scanLesen.nextLine();
			String[] sarray = s.split(";");
			System.out.println("Name: "+ sarray[0] + "  Personalnummer: " + sarray[1]);
		}
		
		RandomAccessFile freierZugriff = new RandomAccessFile("java1.txt", "rw");
		
		freierZugriff.writeChars("Das kommt vom RandomAccessFile \n");
		freierZugriff.writeChars("Das kommt vom RandomAccessFile \n");

		freierZugriff.close();
		
		freierZugriff = new RandomAccessFile("java1.txt", "r");
		
		long laenge = freierZugriff.length();
		
		System.out.println(freierZugriff.getFilePointer());		
		System.out.println(laenge);	
		
		freierZugriff.seek(laenge/2);
		System.out.println(freierZugriff.getFilePointer());		
		System.out.println((char)freierZugriff.read());
		
		freierZugriff.seek(5);
		System.out.println((char)freierZugriff.read());
		
		freierZugriff.close();
		
		FileWriter schreiben = new FileWriter("java.txt");
		
		for (int i = 65; i < 91; i++) 
			schreiben.write(i);
		
		schreiben.write(System.getProperty("line.separator"));
		schreiben.write("Das große ABC...");
		schreiben.write(System.getProperty("line.separator"));
		schreiben.write("Eine weitere Zeile");
		
		// Datei schließen:
		schreiben.close();

		FileReader lesen = new FileReader("java.txt");
		
		char[] c = new char[1];
		
		while(lesen.read(c) != -1) 
			System.out.print(c[0]);
		
		// Datei schließen
		lesen.close();
		System.out.println();
		
		char[] zeilen = new char[100];
		lesen = new FileReader("java.txt");
		
		lesen.read(zeilen);
		lesen.close();
		
		for(int i = 0; i < zeilen.length; i++) {
			System.out.print(zeilen[i]);
		}
		System.out.println();
		
		
		
	}

}
