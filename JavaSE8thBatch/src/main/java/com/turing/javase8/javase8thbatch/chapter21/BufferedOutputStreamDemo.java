/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("./temp3.txt");
      
        try(BufferedOutputStream fOut = new BufferedOutputStream(new FileOutputStream(file));
            )
        {
            for (int i = 0; i < 10; i++) {
                char ch = 'A';
                 for (int j = 0; j < 26; j++) {
                    fOut.write(ch);
                    ch++;
                }
                String str = "\r\nHello";
                fOut.write(str.getBytes());
            }
            
           
          
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
