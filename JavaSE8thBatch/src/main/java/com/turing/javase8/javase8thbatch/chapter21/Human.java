/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.Serializable;

/**
 *
 * @author macbook
 */
public class Human implements Serializable{
    String name;
    int  age;
    Human(String name,int age)
    {
        this.name = name;
        this.age =age;
    }
}
