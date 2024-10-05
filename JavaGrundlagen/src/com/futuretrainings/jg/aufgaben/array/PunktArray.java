package com.futuretrainings.jg.aufgaben.array;

import java.util.*;

public class PunktArray {
	Punkt[] punkte;

	PunktArray(Punkt[] punkte) {
		this.punkte = Arrays.copyOf(punkte, punkte.length);
	}

	double entfernung(Punkt p1, Punkt p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}

	public double maximum() {
		double max = 0;

		for (int i = 0; i < this.punkte.length; i++)
			for (int j = i + 1; j < this.punkte.length; j++) {
				double entf = entfernung(punkte[i], punkte[j]);
				if (entf > max)
					max = entf;
			}

		return max;
	}
}
