/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class VariableDemo {
    public static void main(String[] args) {
        
        int a = 16;
        int b = 4;
        
        System.out.println("A "+a);
        System.out.println("B "+b);
        
        System.out.println(" + "+ (a + b));
        System.out.println(" - "+ (a - b));
        System.out.println(" * "+ (a * b));
        System.out.println(" / "+ (a / b));
        System.out.println(" % "+ (a % b));
        
        a += 2;
        System.out.println("A "+a);
        
        //a = "Hello";
        a = -10;
    }
}
