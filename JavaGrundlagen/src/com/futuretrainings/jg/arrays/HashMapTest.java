package com.futuretrainings.jg.arrays;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> lang = new HashMap<String, String>();
		
		lang.put("Hello", "Hallo");
		lang.put("Guten Morgen", "good morning");
		lang.put("rechnen", "computing");
		lang.put("Bitte Wert eingeben", "please input value");
		
		System.out.println(lang.get("Hallo"));
		
		System.out.println(lang.get("Bitte Wert eingeben")+": ");

	}

}
