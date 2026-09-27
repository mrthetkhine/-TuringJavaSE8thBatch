/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter11;

/**
 *
 * @author macbook
 */
class DemoThread implements Runnable
{
    String name;
    
    public DemoThread(String name)
    {
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
            }
            System.out.println("Name "+this.name +" i=> "+i);
        }
    }
    
}
public class RunnableDemo {
    public static void main(String[] args) {
        DemoThread one = new DemoThread("one");
        DemoThread two = new DemoThread("two");
        
        Thread  t1 = new Thread(one);
        Thread  t2 = new Thread(two);
        
        t1.start();
        t2.start();
        
        System.out.println("T1 priority " + t1.getPriority());
        System.out.println("T2 priority " + t2.getPriority());
    }
}
