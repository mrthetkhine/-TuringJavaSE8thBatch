/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class TypeConversion {
    public static void main(String[] args) {
        int source = 10;
        long dest ;
        
        float d  = source;
        /*
        source ->widening
        int->long
        */
        dest = source;
        
        
        source =(int) dest;
        d = dest;
        //dest = d;
        
        byte b = 10;
        
        b = (byte)(b + 1);
        System.out.println("B "+b);
    }
}
