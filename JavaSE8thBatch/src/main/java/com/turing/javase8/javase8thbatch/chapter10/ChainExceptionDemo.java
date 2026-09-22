/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class ChainExceptionDemo {
    static void process()throws Exception
    {
        Exception exception = new ArithmeticException("Custom Arithmetic Exception");
        exception.initCause(new Exception("Initial cause"));
        
        throw exception;
    }
    public static void main(String[] args) {
        try
        {
            process();
        }
        catch(Exception e)
        {
            System.out.println("Message "+e.getMessage());
            System.out.println("Cause "+e.getCause());
        }
    }
}
