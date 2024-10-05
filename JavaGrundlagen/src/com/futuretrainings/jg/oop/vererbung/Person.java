package com.futuretrainings.jg.oop.vererbung;

public class Person {
	
    protected String name;
	
	public Person() {
		this.name = "n.a.";
	}
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String greet() {
		return "Hallo Person";
	}

}
