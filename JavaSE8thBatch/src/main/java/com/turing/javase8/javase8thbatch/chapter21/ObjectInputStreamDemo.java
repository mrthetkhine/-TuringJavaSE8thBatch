/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author macbook
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("./human.obj");
      
        Human h = null;
        try(ObjectInputStream fIn = new ObjectInputStream(new FileInputStream(file));
            )
        {
           h =(Human) fIn.readObject();
            System.out.println("Name "+h.name);
            System.out.println("Age "+h.age);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
