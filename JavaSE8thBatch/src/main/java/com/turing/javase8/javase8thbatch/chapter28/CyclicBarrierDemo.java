/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author macbook
 */
class Student extends Thread
{
    String name;
    CyclicBarrier cb;
    
    public Student(String name,CyclicBarrier cb)
    {
        this.name = name;
        this.cb = cb;
    }
    public void run()
    {
        Random random = new Random();
        try
        {
            System.out.println("Student "+this.name+" started");
            Thread.sleep(random.nextInt(1000));
            System.out.println("Student "+this.name + " arrived");
            this.cb.await();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class StartSession implements Runnable
{
    public void run()
    {
        System.out.println("Start live session");
    }
}
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3,new StartSession());
        
        Student s1 = new Student("one",cb);
        Student s2 = new Student("two",cb);
        Student s3 = new Student("three",cb);
        
        s1.start();
        s2.start();
        s3.start();
        
        try
        {
            cb.await();
            System.out.println("Action done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
