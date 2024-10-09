package com.futuretrainings.jg.aufgaben.exceptions;

public class MonatTest {
    public static void main(String[] args) {
        Monat monat10 = new Monat(10);
        System.out.println(monat10.getMonatsname());
        Monat monat13 = null;
        try {
            monat13 = new Monat(13);
            System.out.println(monat13.getMonatsname());
        } catch (MonatAusnahme e) {
            System.out.println(e.getMessage());
        }
    }

}
