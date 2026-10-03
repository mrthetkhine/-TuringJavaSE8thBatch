/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class Student {
    String name;
    
    @NullOrEmpty(message="School should not null or empty")
    String school;
    
    public Student(String name, String school)
    {
        this.name = name;
        this.school = school;
    }
}
 