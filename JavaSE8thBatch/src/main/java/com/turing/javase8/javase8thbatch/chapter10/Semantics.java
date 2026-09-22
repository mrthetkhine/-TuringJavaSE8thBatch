/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class Semantics {
    static float div(float a,float b)
    {
        if( Float.isNaN(a) || Float.isNaN(b))
        {
            throw new RuntimeException("A or B is NaN");
        }
        return a/b;
    }
    static float process()
    {
        try
        {
            float result = div(10,Float.NaN);
            return result;
        }
        catch(Exception e)
        {
            System.out.println("Exception "+e.getMessage());
            //return 100;
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
            return 20.F;
        }
        //return 100;
    }
    public static void main(String[] args) {
        
        float a = process();
        System.out.println("A "+a);
    }
}
