package com.futuretrainings.jg.arrays;

public class Stapel {
	private static final int INITIAL_CAPACITY = 16;
	private int[] elements;
	private int size; // zeigt auf den nächsten freien Platz
	
	public Stapel() {
		elements = new int[INITIAL_CAPACITY];
	}

	public void push(int e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public int pop() {
		return elements[--size];
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			int[] neuesArray = new int[(2 * size)];

			for (int i = 0; i < size; i++) {
				neuesArray[i] = elements[i];
			}

			elements = neuesArray;
		}
	}
}
