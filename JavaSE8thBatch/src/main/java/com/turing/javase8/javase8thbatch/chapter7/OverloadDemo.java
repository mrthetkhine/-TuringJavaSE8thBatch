/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class OverloadDemo {
    
    void println(short a)
    {
        System.out.println("short version ");
        System.out.println(a);
    }
    void println(int a)
    {
        System.out.println("Integer version ");
        System.out.println(a);
    }
    void println(long a)
    {
        System.out.println("Long version ");
        System.out.println(a);
    }
    void println(String a)
    {
        System.out.println("String version");
        System.out.println(a);
    }
    /*
    double println(int a)
    {
        System.out.println("int version");
        return a;
    }
    */
    public static void main(String[] args) {
        /*
        int a = 10;
        System.out.println(a);
        
        String str = "Hello";
        System.out.println(str);
        */
        byte b = 30;
        OverloadDemo demo = new OverloadDemo();
        demo.println(10);
        demo.println(b+1);
        demo.println("Hello");
    }
}
