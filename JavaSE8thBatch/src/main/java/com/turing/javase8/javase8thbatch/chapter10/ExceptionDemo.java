/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try
        {
            int result = 5/ 0;
            System.out.println("Result "+result);
            
            String str = "hello";
            System.out.println("toUpperCase "+str.toUpperCase());
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic "+ae.getMessage());
        }
        catch(NullPointerException ne)
        {
            System.out.println("NullPointerException "+ne.getMessage());
        }
        finally
        {
            System.out.println("Finally always executed");
        }
        System.out.println("End");
    }
}
