/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter17;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author macbook
 */
public class StringApi3 {
    public static void main(String[] args) {
        String str = " hello world\r\t\n     ";
        System.out.println("str >>"+str+"<<");
        System.out.println("str >>"+str.trim()+"<<");
        System.out.println("str >>"+str.strip()+"<<");
        System.out.println("str stripLeading>>"+str.stripLeading()+"<<");
        System.out.println("str stripTrailing>>"+str.stripTrailing()+"<<");
        
        String str2 = String.join(";", "Apple","Orange","Banana");
        System.out.println("str2 "+str2);
        
        System.out.println("Apple 0 "+ ("Apple".codePointAt(0)));
        
        str2 = " ";
        System.out.println("isEmpty "+str2.isEmpty());
        System.out.println("isBlank "+str2.isBlank());
        
        String str3 = "first\r\nsecond\r\n";
        List<String> lines = str3.lines().collect(Collectors.toList());
        for (String line:lines) {
            System.out.println("Line "+line);
        }
        
        str2 = String.join(";", "Apple","Orange","Banana");
        System.out.println("str2 "+str2);

        String[]arr = str2.split(";");
        for (String item:arr) {
            System.out.println("Item "+item);
        }
    }
}
