/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class ThrowDemo {
    static float div(float a,float b)
    {
        if( Float.isNaN(a) || Float.isNaN(b))
        {
            throw new RuntimeException("A or B is NaN");
        }
        return a/b;
    }
    static float div2(float a,float b)throws Exception
    {
        if( Float.isNaN(a) || Float.isNaN(b))
        {
            throw new Exception("A or B is NaN");
        }
        return a/b;
    }
    public static void main(String[] args) {
        
        /*
        System.out.println("1/NaN "+ div(1.0F,Float.NaN));
        */
        try
        {
            System.out.println("1/NaN "+ div2(1.0F,Float.NaN));
        }
        catch(Exception e)
        {
            System.out.println("Exception "+e.getMessage());
        }
        
        System.out.println("End");
    }
}
