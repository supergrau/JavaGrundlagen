package com.futuretrainings.jg.aufgaben.array;

public class PunktArrayTest {

	public static void main(String[] args) {
		Punkt[] punkte = { new Punkt(5, 3), new Punkt(1, 2), new Punkt(12, 23), new Punkt(3, 4), };

		PunktArray pa = new PunktArray(punkte);

		System.out.println(pa.maximum());
		System.out.println();
		System.out.println(pa.entfernung(punkte[0], punkte[1]));
		System.out.println(pa.entfernung(punkte[0], punkte[2]));
		System.out.println(pa.entfernung(punkte[0], punkte[3]));
		System.out.println(pa.entfernung(punkte[1], punkte[2]));
		System.out.println(pa.entfernung(punkte[1], punkte[3]));
		System.out.println(pa.entfernung(punkte[2], punkte[3]));
	}

}
