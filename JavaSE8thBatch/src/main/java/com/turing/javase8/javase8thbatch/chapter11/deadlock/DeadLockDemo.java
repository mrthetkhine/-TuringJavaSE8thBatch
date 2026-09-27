/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter11.deadlock;

import com.turing.javase8.javase8thbatch.chapter11.Data;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author macbook
 */
class IncThread extends Thread
{
    String name;
    Data data;
    ReentrantLock rLock;
    
    public IncThread(String name,Data data,ReentrantLock rLock)
    {
        this.name = name;
        this.data = data;
        this.rLock = rLock;
    }
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            
            this.rLock.lock();
            this.data.value++;
            System.out.println("Inc "+this.name);
            this.rLock.unlock();
        }
    }
}
public class DeadLockDemo {
    public static void main(String[] args) {
        Data data = new Data();
        ReentrantLock rLock = new ReentrantLock();
        
        IncThread t1 = new IncThread("one",data,rLock);
        IncThread t2 = new IncThread("two",data,rLock);
        IncThread t3 = new IncThread("three",data,rLock);
        
        System.out.println("T1get State "+t1.getState());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("T1get State "+t1.getState());
        try
        {
            System.out.println("T1 get State "+t1.getState());
            t1.join();
            t2.join();
            t3.join();
            
            System.out.println("Data.value "+data.value);
            System.out.println("T1 get State "+t1.getState());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
