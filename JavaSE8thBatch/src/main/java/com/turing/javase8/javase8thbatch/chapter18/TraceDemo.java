/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class TraceDemo {
    static void methodA()
    {
        System.out.println("Method A");
        methodB();
    }
    static void methodB()
    {
        System.out.println("Method B");
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for(StackTraceElement ele: elements)
        {
            System.out.println("Ele "+ele.getClassName()
                    + " method "+ele.getMethodName()
                    +" line "+ele.getLineNumber()
            );
        }
    }
    public static void main(String[] args) {
        System.out.println("Main");
        methodA();
    }
}
