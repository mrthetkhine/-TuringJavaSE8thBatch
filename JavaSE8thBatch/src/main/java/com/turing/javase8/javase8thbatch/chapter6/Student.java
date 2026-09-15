/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Student {
    String name;
    int age;
    
    void display()
    {
        System.out.println("Name "+this.name+" Age "+this.age);
    }
    public static void main(String[] args) {
        Student mgMg = new Student();
        mgMg.name = "Mg Mg";
        mgMg.age = 20;
        
        Student aungAung = new Student();
        aungAung.name = "Aung Aung";
        aungAung.age = 30;
        
        mgMg.display();
        aungAung.display();
    }
}
