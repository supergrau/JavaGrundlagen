package com.futuretrainings.jg.aufgaben.oop;

/**
 * Comment...
 */
public class SquareDefinition {
    int a;

    public SquareDefinition(int a) {
        this.a = a;
    }

    /**
     *
     * @return
     * Area of square
     */
    public int Area() {
        return this.a * this.a;
    }

    /**
     * Overloaded Method
     * @param s
     * @return
     */
    public static int Area(SquareDefinition s) {
        return s.a * s.a;
    }
}
