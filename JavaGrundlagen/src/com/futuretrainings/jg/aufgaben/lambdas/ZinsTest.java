package com.futuretrainings.jg.aufgaben.lambdas;

import java.util.Arrays;
import java.util.List;

public class ZinsTest {
    public static void main(String[] args) {
        List<Double> salden = Arrays.asList(
                123.4, 567.8, 987.6, 543.2, 111.1);
        double z = 0.05;

        for (double saldo : salden) {
            double zinsen = saldo * z;
            double neuerSaldo = saldo + zinsen;
            System.out.printf(
                    "alt = %.2f zins = %.2f neu = %.2f\n",
                    saldo, zinsen, neuerSaldo
            );
        }

        // Vereinfacht mit map und forEach
        salden.stream().map(s -> s + s * z).forEach(System.out::println);
    }
}
