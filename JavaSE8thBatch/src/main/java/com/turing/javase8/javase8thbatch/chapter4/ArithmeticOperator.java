/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        System.out.println("A " + a);
        System.out.println("B " + b);
        
        System.out.println(" + "+ a + b);
        System.out.println(" - "+ (a - b));
        System.out.println(" * "+ (a * b));
        System.out.println(" / "+ (a / b));
        System.out.println(" % "+ (a % b));
        
        //System.out.println(" 1/0 "+(1/0));
        System.out.println(" 1.0/0 "+(1.0/0));
        System.out.println(" 10.0/3  "+ (10.0 / 3 ));
        
        for (int i = 0; i < 12; i++) {
            System.out.println(i %4);
        }
        //System.out.println(false+true);
    }
}
