package com.futuretrainings.jg.oop.vererbung;

public class Mitarbeiter extends Person {
	
	private String abteilung;
	
	public Mitarbeiter() {
		super();
		this.abteilung = "n.a";
	}
	
	public Mitarbeiter(String name, String abteilung) {
		super(name);
		this.abteilung = abteilung;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}
	
	public String greet() {
		return "Hallo Mitarbeiter";
	}

}
