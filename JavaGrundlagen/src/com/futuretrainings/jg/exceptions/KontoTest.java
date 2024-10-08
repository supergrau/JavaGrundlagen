package com.futuretrainings.jg.exceptions;

public class KontoTest {
    public static void main(String[] args) /* throws KontoAusnahme */ {
        Konto meier = null;
        try {
            meier = new Konto(4711, -500);
            meier.zahleAus(400);
        } catch (KontoAusnahme e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Weiter geht's...");
        if (meier != null)
            System.out.println(meier);
    }
}
