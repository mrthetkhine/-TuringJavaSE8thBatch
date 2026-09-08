/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        char ch='A';
        ch++;
        System.out.println("Ch "+ch);
        
        int a = 10;
        int b = ++a;
        System.out.println("A "+a);
        System.out.println("B "+b);
        
        b = a++;
        /*
        b = a;
        a++;
        */
        System.out.println("A "+a);
        System.out.println("B "+b);
        
        int c = 10;
        int d = 5;
        d += c;//d  = d+c;
        System.out.println("D "+d);
        
        float f = 10.1F;
        d += f; //(type d)(d+f)
        
        byte e =10;
        e =(byte)( e + e);
    }
}
