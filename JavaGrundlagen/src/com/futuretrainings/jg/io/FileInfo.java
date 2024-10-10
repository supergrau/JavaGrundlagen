package com.futuretrainings.jg.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfo {

    /**
     * Die Klasse File hat verschiedene Konstruktoren:
     * File(String path)
     * File(String dirName, String name)
     * File(String fileName, String name)
     *
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
       /* Beispiele:

        File file1 = new File("C:\\dir1\\datei.txt");
        File file2 = new File("C:/dir1/datei.txt");
        File file3 = new File("/home/micha/datei.txt");

        */
        File file = new File("/home/micha/digits.java");
        System.out.printf("Name:\t\t\t %s\n", file.getName());
        System.out.printf("Path:\t\t\t %s\n", file.getPath());
        System.out.printf("AbsolutePath:\t\t\t %s\n", file.getAbsolutePath());
        System.out.printf("CanonicalPath:\t\t\t %s\n", file.getCanonicalPath());
        System.out.printf("Parent:\t\t\t %s\n", file.getParent());
        System.out.printf("exists:\t\t\t %s\n", file.exists());
        System.out.printf("Length:\t\t\t %s\n", file.length());
        System.out.printf("canRead:\t\t\t %s\n", file.canRead());
        System.out.printf("canWrite:\t\t\t %s\n", file.canWrite());
        System.out.printf("isFile:\t\t\t %s\n", file.isFile());
        System.out.printf("lastModified:\t\t\t %1$tY-%1$tm-%1$te %1$tH:%1tM\n",
                new Date(file.lastModified()));

    }
}
