/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28.producerconsumer;

import java.util.concurrent.Semaphore;

/**
 *
 * @author macbook
 */
public class Queue {
    private int n;
    
    static Semaphore consumerSem = new Semaphore(0); 
    static Semaphore producerSem = new Semaphore(1); 
    
    public void put(int n)
    {
        try
        {
            producerSem.acquire();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        this.n  = n;
        System.out.println("Put n "+n);
        consumerSem.release();
    }
    public int get()
    {
        try
        {
            consumerSem.acquire();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
      
        System.out.println("Get n "+n);
        producerSem.release();
        return n;
    }
}
