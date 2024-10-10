package com.futuretrainings.jg.aufgaben.lambdas;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        String[] numbers = {"78", "45", "12", "4", "87"};

        Arrays.
                stream(numbers).
                map(Integer::parseInt).
                sorted().
                forEach(System.out::println);
    }

}
