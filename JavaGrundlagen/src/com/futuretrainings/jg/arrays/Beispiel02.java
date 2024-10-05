package com.futuretrainings.jg.arrays;

public class Beispiel02 {

	public static void main(String[] args) {
		int[] array1 = { 3, 5, 2, 7, 8 };
		int[] array2 = new int[5];

//		array2 = array1;
		// tiefe Kopie
		for(int i = 0; i<array1.length; i++) {
			array2[i]=array1[i];
		}
		array2[0] = 9;
		System.out.println(array1[0]);
		System.out.println(array2[0]);

		
		int[] array1a = { 3, 5, 2, 7, 8 };
		int[] array2a = java.util.Arrays.copyOf(array1a, array1a.length);
		for (int i: array2a) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
	}

}
