package com.futuretrainings.jg.arrays;

import java.util.ArrayList;
import java.util.List;

public class ListenTest {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();

		arrayList.add(12);
		arrayList.add(45);
		arrayList.add(56);
		arrayList.add(67);

		System.out.println(arrayList);

		System.out.println(arrayList.get(arrayList.size() - 1));
		System.out.println(arrayList.get(2));
		
		arrayList.add(2345);
		
		for(Integer value : arrayList) {
			System.out.println(value);
		}
			
	

	}

}
