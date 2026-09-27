/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter11.incorrectproducerconsumer;

/**
 *
 * @author macbook
 */
public class IncorrectQueue {
    int n;
    
    public synchronized int get()
    {
        System.out.println("Got "+n);
        return n;
    }
    public synchronized void put(int n)
    {
        System.out.println("Put "+n);
        this.n = n;
    }
}

