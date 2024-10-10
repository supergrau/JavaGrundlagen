package com.futuretrainings.jg.aufgaben.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharLineCounter {
    public static void main(String[] args) throws IOException {
        int chars = 0;
        int lines = 0;

        String source = "/home/micha/etc-liste.txt";
        try (FileInputStream in = new FileInputStream(source))
        {
            int c;
            while ((c = in.read()) != -1) {
                chars++;
                if (c == '\n')
                    lines++;
            }
        }

        System.out.println("Zeichen: " + chars);
        System.out.println("Zeilenwechsel: " + lines);
    }
}
