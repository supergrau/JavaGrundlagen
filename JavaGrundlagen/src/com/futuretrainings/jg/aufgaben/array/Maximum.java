package com.futuretrainings.jg.aufgaben.array;

public class Maximum {
	public static int max(int firstValue, int... remainingValues) {
		int max = firstValue;  // Dies ist eine Annahme!
		
		for(int value: remainingValues) {
			if(value > max)
				max = value;
		}
		return max;
	}
}
