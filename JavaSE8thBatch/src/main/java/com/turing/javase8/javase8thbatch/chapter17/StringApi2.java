/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class StringApi2 {
    public static void main(String[] args) {
        String str = "hello world";
        
        System.out.println("Apple > Orange "+ ("Apple".compareTo("orange")));
        System.out.println("Orange < Apple "+ ("orange".compareTo("apple")));
        System.out.println("a==a "+("a".compareTo("a")));
        
        System.out.println("Index o "+str.indexOf("o"));
        System.out.println("Index i "+str.indexOf("i"));
        System.out.println("Index hell "+str.indexOf("hell"));
        
        System.out.println("Index l "+str.indexOf("l"));
        System.out.println("LastIndex l "+str.lastIndexOf("l"));
        
        String str2 = str.toUpperCase();
        System.out.println("str "+str);
        System.out.println("str2 "+str2);
        
        System.out.println("Substring 4 "+ str.substring(4));
        System.out.println("Substring 4,7 "+ str.substring(4,7));
        
        System.out.println("Replace "+str.replace("ll", "ii"));
        System.out.println("str "+str);
    }
}
