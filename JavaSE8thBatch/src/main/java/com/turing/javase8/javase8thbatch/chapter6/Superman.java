/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Superman extends Human{
    
    public Superman(String name,int age)
    {
       super(name,age); 
    }
    public void show()
    {
        System.out.println("Name "+this.age);
        System.out.println("Phone "+this.phone);
    }
}
