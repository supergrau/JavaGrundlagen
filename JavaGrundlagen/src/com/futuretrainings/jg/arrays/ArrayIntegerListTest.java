package com.futuretrainings.jg.arrays;

public class ArrayIntegerListTest {

	public static void main(String[] args) {
		ArrayIntegerList list = new ArrayIntegerList(50);
		
		list.insertLast(11);
		list.insertLast(22);
		list.insertLast(33);
		list.insertLast(44);
		list.insertLast(55);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLength());

		list.deleteFirst();
		System.out.println(list.getFirst());
		System.out.println(list.getLength());

		System.out.println(list.search(33));
		System.out.println(list.search(34));
	}

}
