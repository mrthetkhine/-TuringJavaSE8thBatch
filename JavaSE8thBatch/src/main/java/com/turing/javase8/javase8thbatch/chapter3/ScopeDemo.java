/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class ScopeDemo {
    public static void main(String[] args) {
        
        //long a;
        {
            int a =10;
            System.out.println("A "+a);
        }
        char a =65;
        System.out.println("A "+a);
    }
}
