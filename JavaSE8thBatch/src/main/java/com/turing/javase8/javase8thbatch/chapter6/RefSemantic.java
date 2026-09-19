/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class RefSemantic {
    public static void main(String[] args) {
        int a = 10;
        int b = a;//copy
        
        a++;
        
        System.out.println("A "+a);
        System.out.println("B "+b);
        
        Data obj = new Data(10);
        Data obj2 = obj;
        obj.value ++;
        
        System.out.println("Obj "+obj.value);
        System.out.println("Obj2 "+obj2.value);
        
        System.out.println("Obj "+obj);
        System.out.println("Obj2 "+obj2);
        
        obj2 = new Data(30);
        obj.value++;
        
        System.out.println("Obj "+obj.value);
        System.out.println("Obj2 "+obj2.value);
    }
}
