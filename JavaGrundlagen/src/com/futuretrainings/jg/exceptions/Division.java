package com.futuretrainings.jg.exceptions;

public class Division {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            try {
                System.out.println(10 / i); // Ereugt eine ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                // throw new RuntimeException(e);
            }
        }
        System.out.println("Nach der Schleife");

        try {
            int a = Integer.parseInt(args[0]);
            System.out.println(100 / a);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Autsch! " + e.getMessage());
        }
    }
}
