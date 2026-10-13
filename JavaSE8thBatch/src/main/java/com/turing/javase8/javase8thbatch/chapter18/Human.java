/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class Human implements Cloneable
{
    String name;
    int age;
    
    public Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    Human createCopy()
    {
        Human h= null;
        try {
            h = (Human)super.clone();
            
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return h;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }
            
}