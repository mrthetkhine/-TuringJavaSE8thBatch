/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter30;

/**
 *
 * @author macbook
 */
public class Human {
    private String name;
    public int age;
    public Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name "+this.name+" Age "+this.age);
    }
}
