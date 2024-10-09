package com.futuretrainings.jg.aufgaben.exceptions;

public class CatchZero {
    static final int MAX = 500;

    public static int getRandom() throws Exception {
        int rnd = (int) (Math.random() * 100);
        if (rnd == 0)
            throw new Exception("Random-Value is 0");

        return rnd;
    }

    public static void main(String[] args) {
        for (int i = 0; i < MAX; i++) {
            try {
                //System.out.println(getRandom());
                int value = getRandom();
            } catch (Exception e) {
                System.out.println(i + " " + e.getMessage());
            }
        }
    }
}
