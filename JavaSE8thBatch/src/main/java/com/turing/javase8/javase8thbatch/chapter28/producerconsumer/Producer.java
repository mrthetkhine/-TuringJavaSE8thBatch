/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28.producerconsumer;


/**
 *
 * @author macbook
 */
public class Producer extends Thread{
    Queue queue;
    
    public Producer(Queue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
        int i = 0;
        while(true)
        {
            this.queue.put(i++);
        }
    }
}
