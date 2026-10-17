/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.util.StringTokenizer;

/**
 *
 * @author macbook
 */
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String input = "apple;orange;banana:mango";
        StringTokenizer tokenizer = new StringTokenizer(input,";:");
        
        while(tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println("Token "+token);
        }
        input = "age=20;name=John;";
       
        tokenizer = new StringTokenizer(input,";:");
        while(tokenizer.hasMoreTokens())
        {
            String entry = tokenizer.nextToken();
            String []keyValues = entry.split("=");
            System.out.println("Key "+keyValues[0]+" Value "+keyValues[1]);
        }
    }
    
}
