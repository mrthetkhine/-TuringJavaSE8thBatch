/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter19;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author macbook
 */
public class QueueDemo {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        
        queue.add(1);
        queue.add(2);
        queue.add(3);
         
           
        
        System.out.println("Peek "+queue.peek());
        
        for(Integer i: queue)
        {
            System.out.println("Item "+i);
        }
        System.out.println("Poll "+queue.poll());
        for(Integer i: queue)
        {
            System.out.println("Item =>"+i);
        }
    }
}
