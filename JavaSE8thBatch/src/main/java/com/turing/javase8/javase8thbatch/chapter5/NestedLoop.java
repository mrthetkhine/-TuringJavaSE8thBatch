/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class NestedLoop {
    public static void main(String[] args) {
        
        for(int i=0;i< 3;i ++)
        {
            System.out.println("outer loop "+i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Inner loop "+j);
            }
        }
    }
}
