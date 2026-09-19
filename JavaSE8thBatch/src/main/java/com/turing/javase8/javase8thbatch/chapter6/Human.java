/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Human {
    private String name;
    int age;
    protected String phone;
    
    public Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public void display()
    {
        System.out.println("Name "+this.name);
        System.out.println("Age "+this.age);
    }
}
