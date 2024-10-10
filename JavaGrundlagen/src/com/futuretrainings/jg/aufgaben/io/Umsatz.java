package com.futuretrainings.jg.aufgaben.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Umsatz {
    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(
                new FileReader("JavaGrundlagen/umsatz.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("liste.txt"),
                     true)) {

            out.println(" Umsatzliste");
            out.println("=============");
            out.println();

            String line;
            double sum = 0;
            while ((line = in.readLine()) != null) {
                double z = 0;
                try {
                    z = Double.parseDouble(line);
                } catch (NumberFormatException e) {
                    continue;
                }

                sum += z;

                out.printf(" €  %8.2f%n", z);
            }

            out.println("-------------");
            out.printf(" €  %8.2f%n", sum);
        }
    }
}
