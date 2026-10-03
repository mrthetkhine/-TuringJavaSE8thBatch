/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class Wrapper {
    public static void main(String[] args) {
        Integer i = 10;
        int a = 10;
        
        String str = "Hello";
        Object obj = str;
        obj = a;
        
        Character ch = new Character('A');
        
        System.out.println("I "+i.intValue());
        i= Integer.valueOf("100");
        i = Integer.valueOf(100);
        
        System.out.println("I "+i);
    }
}
