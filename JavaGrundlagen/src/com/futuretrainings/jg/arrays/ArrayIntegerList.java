package com.futuretrainings.jg.arrays;

public class ArrayIntegerList implements IntegerList {

	private int[] array;
	private int length;
	
	public ArrayIntegerList(int length) {
		array = new int[length];
		this.length = 0;
	}
	
	
	public int getLength() {
		
		return this.length;
	}

	public void insertLast(int value) {
		array[length] = value;
		if (value < 0)
			return;
		
		if(this.length < array.length - 1)
			this.length++;
	}

	public int getFirst() {
		if(this.length > 0)
			return this.array[0];
		else
			return -1;
	}

	public void deleteFirst() {
		for (int i = 0; i < length; i++) {
			array[i] = array[i + 1];
		}
		
		length--;

	}

	public boolean search(int value) {
		for (int i = 0; i < length; i++) {
			if (array[i] == value)
				return true;
		}
		
		return false;
	}

}
