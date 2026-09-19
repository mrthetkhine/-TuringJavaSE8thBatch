/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class SumDemo {
    static int sum(String message,int...nums)
    {
        int total = 0;
        for (final int item : nums) {
            total += item;
        }
        return total;
    }
    
    public static void main(String[] args) {
        int result = sum("Hello",1,2);
        System.out.println("Sum "+result);
        
        System.out.println("Sum "+sum("Hello",1,2,3,4,5));
    }
}
