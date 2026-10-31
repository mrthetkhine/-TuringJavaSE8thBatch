/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author macbook
 */
public class ObjectOutuputStreamDemo {
    public static void main(String[] args) {
        File file = new File("./human.obj");
      
        Human h = new Human("Jhon",50);
        try(ObjectOutputStream fOut = new ObjectOutputStream(new FileOutputStream(file));
            )
        {
           fOut.writeObject(h);
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
