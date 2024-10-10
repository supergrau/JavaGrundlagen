package com.futuretrainings.jg.aufgaben.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class ToUpperCase extends FilterReader {
    public ToUpperCase(Reader in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        if (c != -1)
            return Character.toUpperCase((char) c);
        else
            return -1;
    }

    public int read(char[] c, int offset, int count) throws IOException {
        int r = super.read(c, offset, count);
        for (int i = 0; i < r; i++) {
            c[offset + i] = Character.toUpperCase(c[offset + i]);
        }
        return r;
    }

    public int read(char[] c) throws IOException {
        return read(c, 0, c.length);
    }

    public static void main(String[] args) throws IOException {
        try (ToUpperCase in = new ToUpperCase(new BufferedReader(
                new FileReader("liste.dat")))) {

            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}
