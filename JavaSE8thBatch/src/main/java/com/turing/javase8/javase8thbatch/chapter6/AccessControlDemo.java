/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */

public class AccessControlDemo {
    public static void main(String[] args) {
        Human obj = new Human("Jhon",43);
        obj.phone = "002221";
        System.out.println("Obj "+obj.age);
        
        obj.display();
    }
}
