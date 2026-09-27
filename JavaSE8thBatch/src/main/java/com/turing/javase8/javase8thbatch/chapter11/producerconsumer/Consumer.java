/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter11.producerconsumer;

import com.turing.javase8.javase8thbatch.chapter11.incorrectproducerconsumer.IncorrectQueue;

/**
 *
 * @author macbook
 */
public class Consumer extends Thread{
    Queue queue;
    
    public Consumer(Queue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
       
        while(true)
        {
            this.queue.get();
        }
    }
}
