package com.futuretrainings.jg.oop;


public class ApelfarbeTest {

	public static void main(String[] args) {
		info(Ampelfarbe.ROT);
		info(Ampelfarbe.GELB);
		info(Ampelfarbe.GRUEN);		
	}
	
	public static void info(Ampelfarbe farbe) {
		switch (farbe) {
		case ROT:
			System.out.println(farbe + ": Stopp");
			break;
		case GELB:
			System.out.println(farbe + ": Achtung");
			break;
		case GRUEN:
			System.out.println(farbe + ": Los geht's");
			break;
		}
	}

}
