/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author macbook
 */
class DataWithAtomic
{
    AtomicInteger value =new AtomicInteger();
}
class IncThreadWithAtomic extends Thread
{
    DataWithAtomic data;
    public IncThreadWithAtomic(DataWithAtomic data)
    {
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 100_000; i++) {
            data.value.incrementAndGet();
        }
    }
}
public class AtomicDemo {
    public static void main(String[] args) {
        DataWithAtomic data = new DataWithAtomic();
        
        IncThreadWithAtomic t1 = new IncThreadWithAtomic(data);
        IncThreadWithAtomic t2 = new IncThreadWithAtomic(data);
        IncThreadWithAtomic t3 = new IncThreadWithAtomic(data);
        
        t1.start();
        t2.start();
        t3.start();
        try
        {
            t1.join();
            t2.join();
            t3.join();
            System.out.println("Data "+data.value.get());
        }
        catch(Exception e)
        {
        }
    }
}
