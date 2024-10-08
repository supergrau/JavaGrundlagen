package com.futuretrainings.jg.exceptions;

public class MyExceptionV1Test {
    public static String getNachbarn(int[] x, int i) throws MyExceptionsV1 {
        try {
            return x[i - 1] + " " + x[i] + x[i + 1];
        } catch (RuntimeException e) {
            throw (MyExceptionsV1) new MyExceptionsV1().initCause(e);
        }
    }

    public static void main(String[] args) {
        int[] a = null;
        int[] b = {1, 2, 3, 4, 5};
        try {
            System.out.println(getNachbarn(a, 4));
        } catch (MyExceptionsV1 e) {
            System.out.println("Ursache: " + e.getCause());
        }

        try {
            System.out.println(getNachbarn(b, 4));
        } catch (MyExceptionsV1 e) {
            System.out.println("Ursache: " + e.getCause());
        }
    }
}
