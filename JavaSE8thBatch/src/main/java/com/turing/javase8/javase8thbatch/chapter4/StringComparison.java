/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        
        System.out.println("Str1== str2 "+( str1 == str2)); 
        System.out.println("str1.equals(str2) "+( str1.equals(str2)));
        
        String str3 = new String("Hello");
        System.out.println("Str1== str3 "+( str1 == str3)); 
        System.out.println("str1.equals(str3) "+( str1.equals(str3)));
        
        String str4 = null;
        System.out.println("Hello.equals(str3) "+("Hello".equals(str4)));
        System.out.println("str4.equals(str3) "+(str4.equals("Hello")));
    }
}
