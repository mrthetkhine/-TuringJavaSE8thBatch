/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Counter {
    static int count=0;
    
    int data;
    int id;
    
    static
    {
        System.out.println("Static block 1");
    }
    static
    {
        System.out.println("Static block 2");
    }
    public Counter(int data)
    {
        this.data = data;
        this.id = Counter.count++;
        System.out.println("ID "+id);
    }
    void display()
    {
        System.out.println("Data "+this.data);
        System.out.println("Id "+this.id);
        System.out.println("Count "+Counter.count);
        
        show();
    }
    static void show()
    {
        System.out.println("Show "+Counter.count);
        //display();
    }
    
    public static void main(String[] args) {
        System.out.println("Counter "+Counter.count);
        
        Counter c1 = new Counter(10);
        c1.data++;
        
        Counter c2 = new Counter(20);
        c2.data ++;
        
        c1.display();
        c2.display();
        
        Counter.show();
    }
}
