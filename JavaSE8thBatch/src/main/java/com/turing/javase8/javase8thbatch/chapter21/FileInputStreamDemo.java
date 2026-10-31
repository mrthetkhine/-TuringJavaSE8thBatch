/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author macbook
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase8/javase8thbatch/chapter21/FileDemo.java");
        try(FileInputStream fIn = new FileInputStream(file))
        {
            int size = fIn.available();
            System.out.println("Total avialble byte "+size);
            int n = size / 40;
            for (int i = 0; i < n; i++) {
                int data = fIn.read();
                System.out.print((char)data);
            }
            System.out.println();
            System.out.println("Total avialble byte "+fIn.available());
            byte b[]  = new byte[n];
            if(fIn.read(b) != n)
            {
                System.out.println("Coud not read");
            }
            System.out.println(new String(b));
            System.out.println("Total avialble byte "+fIn.available());
            
            fIn.skip(size/2);
            if(fIn.read(b,n/2,n/2) != n/2)
            {
                System.out.println("Coud not read");
            }
            System.out.println(new String(b));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
