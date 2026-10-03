/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class BoxingUnboxing {
    public static void main(String[] args) {
        int a = 100;
        Integer i = a;//Primitive->Wrapper=Boxing
        int b = 200;
        
        int result = i + b;//Wrapper->Primitive =Unboxing.
        System.out.println("Result "+ result);
        
        Integer c = new Integer(100);
        Integer d = new Integer(100);
        System.out.println("c==d "+(c==d));
        
        c = 100;
        d = 100;
        System.out.println("c==d "+(c==d));
        
        c = 128;
        d = 128;
        System.out.println("c==d "+(c==d));
        
        System.out.println("c.intValue()==d.intValue() "+(c.intValue()==d.intValue()));
        
        c = null;
        System.out.println("c==d "+(c==d));
        System.out.println("c==128 "+(c == 128));
    }
}
