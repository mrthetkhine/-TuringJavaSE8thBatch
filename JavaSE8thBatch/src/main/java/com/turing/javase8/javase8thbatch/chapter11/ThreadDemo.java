/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter11;

/**
 *
 * @author macbook
 */
class CounterThread extends Thread
{
    String name;
    public CounterThread(String name)
    {
        super(name);
        this.name = name;
        
    }
    public void run()
    {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread "+this.name +" i==> "+i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        CounterThread t1 = new CounterThread("One");
        CounterThread t2 = new CounterThread("Two");
        CounterThread t3 = new CounterThread("Three");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
