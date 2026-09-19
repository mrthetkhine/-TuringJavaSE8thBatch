/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "hello";
        str = str.toUpperCase();
        
        System.out.println("Str "+str);
        System.out.println("Length "+str.length());
        
        System.out.println("CharAt(0) "+str.charAt(0));
    }
}
