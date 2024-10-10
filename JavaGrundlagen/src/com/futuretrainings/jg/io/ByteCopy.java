package com.futuretrainings.jg.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCopy {
    public static void main(String[] args)  {
        String source = "/austausch/software/linux/cal-4.0/cal.exe";
        String dest = "/home/micha/dest/cal.exe";

        try (
                FileInputStream in = new FileInputStream(source);
                FileOutputStream out = new FileOutputStream(dest)
            )
        {
            int c;
            while((c=in.read()) != -1) {

                out.write(c);
                System.out.print(".");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
