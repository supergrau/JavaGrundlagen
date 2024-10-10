package com.futuretrainings.jg.aufgaben.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyMore {
    private static final int SIZE = 20;

    public static void browse(Reader r) throws IOException {
        try (BufferedReader in = new BufferedReader(r)) {

            String line;
            int count = 0;
            byte[] b = new byte[8];
            while ((line = in.readLine()) != null) {
                count++;
                System.out.println(line);
                if (count == SIZE) {
                    count = 0;
                    System.out.print("-- Weiter mit RETURN --");
                    System.in.read(b);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        browse(new FileReader("/home/micha/etc-liste.txt"));
    }
}
