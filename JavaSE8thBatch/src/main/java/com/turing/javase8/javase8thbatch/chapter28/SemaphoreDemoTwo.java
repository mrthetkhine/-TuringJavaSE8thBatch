/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.concurrent.Semaphore;

/**
 *
 * @author macbook
 */
class Printer extends Thread
{
    String name;
    Semaphore sem;
    public Printer(String name,Semaphore sem)
    {
        this.name = name;
        this.sem = sem;
    }
    public void run()
    {
        for (int i = 0; i < 50; i++) {
            try
            {
                this.sem.acquire();
                System.out.println("Name "+this.name+" i=> "+i);
                
                Thread.sleep(300);
                this.sem.release();
            }
            catch(Exception e)
            {
            }
        }
    }
}
public class SemaphoreDemoTwo {
    public static void main(String[] args) {
        Semaphore sem= new Semaphore(2);
        Printer p1 = new Printer("one",sem);
        Printer p2 = new Printer("two",sem);
        Printer p3 = new Printer("three",sem);
        
        p1.start();
        p2.start();
        p3.start();
    }
}
