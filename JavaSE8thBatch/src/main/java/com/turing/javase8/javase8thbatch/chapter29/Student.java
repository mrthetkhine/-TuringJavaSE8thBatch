/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter29;

/**
 *
 * @author macbook
 */
public class Student {
    String name;
    Gender gender;
    int age;
    
    public Student(String name,Gender gender,int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gender=" + gender + ", age=" + age + '}';
    }
    
}
