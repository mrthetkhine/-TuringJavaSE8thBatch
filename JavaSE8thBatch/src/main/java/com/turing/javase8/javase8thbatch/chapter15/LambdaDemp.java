/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface Action
{
    void action();
    //void another();
}
public class LambdaDemp {
    void process()
    {
        System.out.println("Process");
    }
    static void hello()
    {
        System.out.println("Hello");
    }
    static void hi()
    {
        System.out.println("hi");
    }
    static int getData()
    {
        return 100;
    }
    public static void main(String[] args) {
        //var fun = LambdaDemp::hello;
        Action fun = LambdaDemp::hello;
        
        fun.action();
        
        fun = LambdaDemp::hi;
        fun.action();
        
        LambdaDemp demo = new LambdaDemp();
        fun = demo::process;
        fun.action();
        
        fun = ()->System.out.println("Hello World");
        
        fun.action();
        final int n = 10;
        ///n= 100;
        fun = ()->{
            System.out.println("Hello");
            System.out.println("World");
            System.out.println("N "+n);
            //n++;
        };
        //n = 100;
        fun.action();
    }
}
