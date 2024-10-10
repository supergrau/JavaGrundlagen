package com.futuretrainings.jg.aufgaben.lambdas;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {

        String[] sarr =
                {"Festplatte", "CPU", "Grafikkarte", "Motherboard", "Haupspeicher"};

        Arrays.sort(sarr, (s0, s1) -> s0.length() - s1.length());
        System.out.println(Arrays.toString(sarr));

        for(String s:sarr){
            System.out.printf("%s - Länge: %d\n", s, s.length());
        }
    }
}
