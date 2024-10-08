package com.futuretrainings.jg.exceptions;

public class KontoFinallyTest {
    public static void main(String[] args) {
        try {
            Konto kto = new Konto(4711, 500);

            for (int i = 1; i <= 3; i++) {
                System.out.println("BEGINN SCHRITT " + i);

                try {
                    switch (i) {
                        case 1:
                            kto.zahleAus(100);
                            break;
                        case 2:
                            kto.zahleAus(700);
                            break;
                        case 3:
                            kto.zahleAus(200 / 0);
                            break;
                    }
                } catch (KontoAusnahme e) {
                    System.out.println(e);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                finally {
                    System.out.println("Ausgabe im finally-Block: " + kto.getSaldo());
                }
                System.out.println("ENDE SCHRITT " + i);
                System.out.println();
            }
        } catch (KontoAusnahme e) {
            System.out.println(e);
        }

        System.out.println("Nach allem...");
    }
}
