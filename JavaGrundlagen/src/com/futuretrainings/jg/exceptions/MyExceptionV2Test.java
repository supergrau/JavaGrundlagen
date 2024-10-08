package com.futuretrainings.jg.exceptions;

public class MyExceptionV2Test {
    public static String getNachbarn(int[] x, int i) throws MyExceptionsV2 {
        try {
            return x[i - 1] + " " + x[i] + x[i + 1];
        } catch (RuntimeException e) {
            throw new MyExceptionsV2(e);
        }
    }

    public static void main(String[] args) {
        int[] a = null;
        int[] b = {1, 2, 3, 4, 5};
        try {
            System.out.println(getNachbarn(a, 4));
        } catch (MyExceptionsV2 e) {
            System.out.println("Ursache: " + e.getCause());
            System.out.println("Message: " + e.getMessage());
        }

        try {
            System.out.println(getNachbarn(b, 4));
        } catch (MyExceptionsV2 e) {
            System.out.println("Ursache: " + e.getCause());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
