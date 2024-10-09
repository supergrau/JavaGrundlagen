package com.futuretrainings.jg.lambdas;

import java.awt.*;

class Example {

}

public class AnonymeKlasseTest {
    public static void main(String[] args) {
        Example e = example();
        System.out.println(e);

        Point p = new Point( 10, 12 ) {

            @Override public String toString() {

                return "(" + x + "," + y + ")";

            }

        };



        System.out.println( p );
    }

    public static Example example() {
        return new Example() {
            public int i = 0;
            public String toString() {
                return i + " Example";
            };
        };
    }
}
