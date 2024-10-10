package com.futuretrainings.jg.aufgaben.lambdas;

import java.util.Arrays;
import java.util.List;

public class ZinsSummenTest {
    public static void main(String[] args) {
        List<Double> salden = Arrays.asList(
                123.4, 567.8, 987.6, 543.2, 111.1);
        double z = 0.05;
        double sum = 0.0;
        for (double saldo : salden) {
            double zinsen = saldo * z;
            double neuerSaldo = saldo + zinsen;
            sum += neuerSaldo;
            System.out.printf(
                    "alt = %.2f zins = %.2f neu = %.2f\n",
                    saldo, zinsen, neuerSaldo
            );

        }
        System.out.printf("Summe: %.2f\n", sum);

        // Vereinfacht mit map und forEach
        sum = salden.stream().map(s -> s + s * z).
                reduce(0.0, (a, b) -> a + b);
        System.out.printf("Summe: %.2f\n", sum);
    }

}
