/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class IntegerDemo {
    public static void main(String[] args) {
        byte a, b, c ;
        a = -128;
        
        System.out.println("A "+a);
        
        a = 127;
        
        a++;
        
        short d = -32768;
        d--;
        System.out.println("D "+d);
        
        d++;
        System.out.println("D "+d);
        
        int e= -2147483648;
        e--;
        System.out.println("E "+e);
        
        long data = 1000;
        System.out.println("Data "+data);
        
        //e = a / 0;
        
    }
}
