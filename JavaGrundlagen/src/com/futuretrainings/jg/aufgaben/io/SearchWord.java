package com.futuretrainings.jg.aufgaben.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class SearchWord {
    public static void search(Reader r, String text) throws IOException {
        try (BufferedReader in = new BufferedReader(r)) {

            String line;
            int count = 0;
            while ((line = in.readLine()) != null) {
                count++;
                if (line.indexOf(text) > 0)
                    System.out.println(count + ": " + line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String file = "/home/micha/etc-liste.txt";
        String word = "conf";

        search(new FileReader(file), word);
    }
}
