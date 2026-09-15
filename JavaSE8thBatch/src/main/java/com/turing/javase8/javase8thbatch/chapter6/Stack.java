/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Stack {
    int []items = new int[10];//[0-9]
    int top = -1;
    
    void push(int element)
    {
        if(this.top >=this.items.length-1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            this.items[++this.top] = element;
        }
        
    }
    int pop()
    {
        if(this.top >=0)
        {
            return this.items[this.top--];
        }
        else
        {
            System.out.println("Stack is empty");
            return -99999;
        }
        
    }
    
    public static void main(String[] args) {
        Stack s1 = new Stack();
        
        for (int i = 0; i < 10; i++) {
            s1.push(i);
        }
        s1.push(10);
        s1.push(20);
        s1.push(30);
        
        System.out.println("Pop "+s1.pop());
        System.out.println("Pop "+s1.pop());
        System.out.println("Pop "+s1.pop());
        
        Stack s2 = new Stack();
        s2.push(100);
        s2.push(200);
        
        System.out.println("S2.pop "+s2.pop());
        System.out.println("S2.pop "+s2.pop());
    }
}
