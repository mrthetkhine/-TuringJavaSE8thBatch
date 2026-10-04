/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class CopyFile {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase8/javase8thbatch/chapter13/ReadFile.java");
        System.out.println("Abs "+file.getAbsolutePath());
        File outFile = new File("./copy.txt");
        try(var fin = new FileInputStream(file);
            var fout = new FileOutputStream(outFile);) 
        {
            
            int ch;
            do
            {
                ch = fin.read();
                if(ch!=-1)
                {
                    fout.write(ch);
                    System.out.print((char)ch);
                }
                
            }while(ch != -1);
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
