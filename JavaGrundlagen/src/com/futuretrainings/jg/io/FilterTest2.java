package com.futuretrainings.jg.io;

import java.io.File;
import java.io.FileFilter;

public class FilterTest2 {
    public static void main(String[] args) {
        String dir = "/etc/";
        String suffix = "conf";

        File file = new File(dir);
        if (!file.isDirectory()) {
            System.err.println(dir + " ist kein Verzeichnis");
            System.exit(1);
        }

        // Mit Lambda-Ausdruck
        FileFilter filter = f -> f.isFile() &&
                        f.getName().endsWith("." + suffix);


        File[] list = file.listFiles(filter);
        long sum = 0;
        for(File f:list) {
            System.out.println(f.getName());
            sum += f.length();
        }
        System.out.println("Speicherbedarf dieser Dateien: " + sum/1024 + " KiB");
    }
}
