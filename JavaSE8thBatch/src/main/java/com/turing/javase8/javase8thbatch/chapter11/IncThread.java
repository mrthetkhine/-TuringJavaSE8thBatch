/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter11;

/**
 *
 * @author macbook
 */
public class IncThread extends Thread{
    String name;
    Data data;
    
    public IncThread(String name,Data data)
    {
        this.name = name;
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 100_000; i++) {
            
            synchronized(this.data)
            {
                this.data.value++;
            }
            
        }
    }
}
