/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class StringApi1 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("CharAt(0) "+str.charAt(0));
        
        char[] arr = new char[3];
        str.getChars(0, 3, arr, 0);
        
        for (char ch : arr) {
            System.out.println("Ch "+ch);
        }
        byte[] bytes = str.getBytes();
        System.out.println("Bytes "+bytes[0]);
        
        String str2 = "Hell";
        
        System.out.println("IgnoreCase "+ str.equalsIgnoreCase("hello world"));
        System.out.println("RegionMatches "+str.regionMatches(0, str2, 0, 4));
        System.out.println("StartWith Hell "+ str.startsWith("Hell"));
        System.out.println("StartWith hell "+ str.startsWith("hell"));
        
        System.out.println("endWith "+ str.endsWith("World"));
        
        System.out.println("endWith world "+ str.toLowerCase().endsWith("world"));
        System.out.println("Uppercase "+ str.toUpperCase());
        System.out.println("str "+str);
        
        System.out.println("startWith 1 "+str.startsWith("ell",1));
    }
}
