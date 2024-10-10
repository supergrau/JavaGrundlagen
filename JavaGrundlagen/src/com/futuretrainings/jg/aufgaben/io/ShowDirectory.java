package com.futuretrainings.jg.aufgaben.io;

import java.io.File;
import java.io.IOException;

public class ShowDirectory {
    public static void main(String[] args) throws IOException {
        String dir = "/austausch/multimedia/bilder/astro-bilder/";
        File file = new File(dir);

        if (!file.isDirectory()) {
            System.out.println(dir + " ist kein Verzeichnis");
            System.exit(1);
        }

        System.out.println(file.getCanonicalPath());
        showFiles(file);
    }

    public static void showFiles(File file) throws IOException {
        File[] list = file.listFiles();

        for (File f : list) {
            System.out.println(f.getCanonicalPath());
            if (f.isDirectory()) {
                showFiles(f);
            }
        }
    }
}
