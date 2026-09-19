/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Factorial {
    int fact(int n)
    {
        System.out.println("Fact "+n);
                
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("fact(4) "+fact.fact(4));
    }
}
