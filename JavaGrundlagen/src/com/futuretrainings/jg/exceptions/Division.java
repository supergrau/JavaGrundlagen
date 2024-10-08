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
    }
}
