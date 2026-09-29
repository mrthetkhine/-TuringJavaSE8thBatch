/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author macbook
 */
class Friend extends Thread
{
    CountDownLatch cdl;
    String name;
    public Friend(String name,CountDownLatch cdl)
    {
        this.name = name;
        this.cdl = cdl;
    }
    public void run()
    {
        Random random = new Random();
        try
        {
            System.out.println("Firend "+this.name+" started");
            Thread.sleep(random.nextInt(1000));
            System.out.println("Friend "+this.name + " arrived");
            this.cdl.countDown();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(3);
        
        Friend f1 =new Friend("one",cdl);
        Friend f2 =new Friend("two",cdl);
        Friend f3 =new Friend("three",cdl);
        Friend f4 =new Friend("four",cdl);
        
        f1.start();
        f2.start();
        f3.start();
        f4.start();
        
        try
        {
            cdl.await();
            System.out.println("Three have arrived");
        }
        catch(Exception e)
        {
        }
    }
}
