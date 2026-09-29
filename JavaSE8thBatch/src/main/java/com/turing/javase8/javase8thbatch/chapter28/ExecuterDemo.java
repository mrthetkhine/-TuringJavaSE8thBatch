/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author macbook
 */
class Counter extends Thread
{
    String name;
    public Counter(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 30; i++) {
            
            try
            {
                System.out.println("Thread "+this.name + " i=> "+i);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ExecuterDemo {
    public static void main(String[] args) {
        Counter c1 =new Counter("one");
        Counter c2 =new Counter("two");
        Counter c3 =new Counter("three");
        Counter c4 =new Counter("four");
        
        /*
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        */
        ExecutorService exs;
        //exs = Executors.newFixedThreadPool(2);
        
        exs = Executors.newCachedThreadPool();
        exs.execute(c1);
        exs.execute(c2);
        exs.execute(c3);
        exs.execute(c4);
        
        try
        {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            exs.shutdown();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
