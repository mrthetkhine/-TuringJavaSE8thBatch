/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter11.incorrectproducerconsumer;

/**
 *
 * @author macbook
 */
class IncorectProducer extends Thread
{
    IncorrectQueue queue;
    
    public IncorectProducer(IncorrectQueue queue)
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
class IncorrectConsumer extends Thread
{
    IncorrectQueue queue;
    
    public IncorrectConsumer(IncorrectQueue queue)
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
public class IncorrectProdcuerConsumer {
    public static void main(String[] args) {
        IncorrectQueue queue = new IncorrectQueue();
        IncorectProducer producer = new IncorectProducer(queue);
        IncorrectConsumer consumer = new IncorrectConsumer(queue);
        
        producer.start();
        consumer.start();
    }
}
