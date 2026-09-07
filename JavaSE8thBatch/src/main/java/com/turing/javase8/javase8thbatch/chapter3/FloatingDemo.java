/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class FloatingDemo {
    public static void main(String[] args) {
        float f = 3.1F;
        double d = 4.1E5;
        
        System.out.println("D "+d);
        System.out.println("F "+f);
        
        f = 123;
        System.out.println("F "+f);
        
        double result = 0.3- 0.2;
        System.out.println("Result "+result);
        
        f = 1.0F/0;
        System.out.println("F "+f);
        
        float posZero = 0;
        float negZero = -0;
        
        System.out.println("PosZero "+ posZero );
        System.out.println("Neg Zero"+ negZero );
        
        result = 1/posZero;
        System.out.println("Result "+result);
        
        result = 1/negZero;
        System.out.println("Result "+result);
        
        result = 0/0.0F;
        System.out.println("Result "+result);
        
        System.out.println("Result == Result "+(result==result));
        
        result = result * 0;
        System.out.println("Result "+result);
        
        System.out.println("Double.isNaN "+Double.isNaN(result));
        
        char ch = 'A';
        ch++;
        System.out.println("Char "+ch);
        
        ch = 67;
        System.out.println("Ch "+ch);
        
    }
}
