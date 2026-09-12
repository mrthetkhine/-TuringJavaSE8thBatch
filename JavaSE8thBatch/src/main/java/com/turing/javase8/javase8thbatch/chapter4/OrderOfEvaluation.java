/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class OrderOfEvaluation {
    public static void main(String[] args) {
        int result = 2 + 3 * 5 ;
        System.out.println("Result "+result);
        
        result = 5 - 3 - 2 ;
        System.out.println("Result "+result);
        
        int a = 10;
        result = a + ++a + a;
        System.out.println("Result "+result);
        System.out.println("A "+a);
    }
}
