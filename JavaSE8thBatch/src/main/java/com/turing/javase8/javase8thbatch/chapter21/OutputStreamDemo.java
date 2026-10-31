/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("./temp.txt");
        File file2 = new File("./temp2.txt");
        try(FileOutputStream fOut = new FileOutputStream(file);
            FileOutputStream fOut2 = new FileOutputStream(file2);    )
        {
            char ch = 'A';
            for (int i = 0; i < 26; i++) {
                fOut.write(ch);
                ch++;
            }
            String str = "\r\nHello";
            fOut.write(str.getBytes());
            fOut2.write(str.getBytes());
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
