/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("./temp.data");
      
        try(DataOutputStream fOut = new DataOutputStream(new FileOutputStream(file));
            )
        {
           fOut.writeUTF("Hello World");
           fOut.writeDouble(10.5);
           fOut.writeInt(500);
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
