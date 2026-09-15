/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class ReturnDemo {
    static void doSomething(int i)
    {
        System.out.println("doSomething "+i);
        if(i==0)
        {
            return;
        }
        System.out.println("doSomething end");
    }
    public static void main(String[] args) {
        doSomething(0);
        System.out.println("End in main");
    }
}
