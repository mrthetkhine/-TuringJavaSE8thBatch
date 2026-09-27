/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter11.producerconsumer;

/**
 *
 * @author macbook
 */
public class Queue {
    int n;
    boolean valueSet = false;
    
    public synchronized void put(int n)
    {
        while(valueSet)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
        //consumer consume, call notify
        System.out.println("Put "+n);
        this.n = n;
        this.valueSet = true;
        this.notify();
    }
    public synchronized int get()
    {
        while(!valueSet)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Got "+n);
        valueSet = false;
        notify();
        return this.n;
    }
}
