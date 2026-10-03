/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class Human {
    @NullOrEmpty(message="Name should not null or empty")
    String name;
    
    String address;
    
    public Human(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
}
 