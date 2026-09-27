/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter11;

/**
 *
 * @author macbook
 */
public class MutualExclusion {
    public static void main(String[] args) {
        Data data = new Data();
        
        IncThread t1 = new IncThread("one",data);
        IncThread t2 = new IncThread("two",data);
        IncThread t3 = new IncThread("thre",data);
        
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
            t1.join();
            t2.join();
            t3.join();
            
            System.out.println("Data.value  "+data.value);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
