/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.Random;
import java.util.concurrent.Phaser;

/**
 *
 * @author macbook
 */
class Processor extends Thread
{
    String name;
    Phaser phaser;
    
    public Processor(String name,Phaser phaser)
    {
        this.name = name;
        this.phaser = phaser;
        this.phaser.register();
    }
    public void run()
    {
        Random random = new Random();
        System.out.println("Thread "+this.name +" start phase 1");
        this.phaser.arriveAndAwaitAdvance();
        
        try
        {
            Thread.sleep(random.nextInt(1000));
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread "+this.name +" start phase 2");
        this.phaser.arriveAndAwaitAdvance();
        
         try
        {
             Thread.sleep(random.nextInt(1000));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread "+this.name +" start phase 3");
        this.phaser.arriveAndDeregister();
    }
}
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser =new Phaser(1);
        int curPhase;
        
        System.out.println("Starting");
        Processor p1 = new Processor("one",phaser);
        Processor p2 = new Processor("two",phaser);
        Processor p3 = new Processor("three",phaser);
        
        p1.start();
        p2.start();
        p3.start();
       
        
        phaser.arriveAndAwaitAdvance();
        curPhase = phaser.getPhase();
        System.out.println("Phase "+curPhase+" Completed");
        
       
        phaser.arriveAndAwaitAdvance();
        curPhase = phaser.getPhase();
        System.out.println("Phase "+curPhase+" Completed");
        
       
        phaser.arriveAndAwaitAdvance();
        curPhase = phaser.getPhase();
        System.out.println("Phase "+curPhase+" Completed");
        
        phaser.arriveAndDeregister();
        
    }
}
