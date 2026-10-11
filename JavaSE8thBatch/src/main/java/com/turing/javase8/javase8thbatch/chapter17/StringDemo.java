/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("str==str2 "+(str==str2));
        System.out.println("str2==str3 "+(str2==str3));
        
        System.out.println("str2.equals(str3) "+str2.equals(str3));
        System.out.println("Length "+str3.length());
        
        String str4 = str3 + "world";
        System.out.println("Str4 "+str4);
        
        String str5 = null;
        //str4 = null + "Hi";
        //str4 = str5.concat( "Hi");
        System.out.println("Str4 "+str4);
        
        str5 = String.valueOf(false);
        System.out.println(str5);
    }
}
