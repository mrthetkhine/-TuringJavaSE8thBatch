/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Arithmetic {
    
    int add(int a ,int b)
    {
        System.out.println("A "+b +" b "+b);
        return a + b;
    }
    public static void main(String[] args) {
        Arithmetic ath = new Arithmetic();
        
        int result = ath.add(3,5);
        System.out.println("Result "+result);
    }
}
