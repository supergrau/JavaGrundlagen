package com.futuretrainings.jg.aufgaben.oop;

public class Punkt {

	// Attribute
	public double x;
	public double y;

	public Punkt() {
		this.x = 0.0;
		this.y = 0.0;
	}

	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punkt(Punkt p) {
		this.x = p.x;
		this.y = p.y;
	}

	public String toString() {
		return "[ " + this.x + " ; " + this.y + " ]";
	}

	public double abstand() {

		return Math.sqrt(x * x + y * y);
	}

}
