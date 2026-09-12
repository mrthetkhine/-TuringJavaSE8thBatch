/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class LogicalOperator {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean haveToGoOut = true;
        
        boolean takeUmbrella = isRaining && haveToGoOut;
        System.out.println("Take umbrealla "+takeUmbrella);
        
        /*
        AND & 
        0 0 = 0
        0 1 = 0
        1 0 = 0
        1 1 = 1
        */
        System.out.println("false && false "+(false && false));
        System.out.println("false && true "+(false && true));
        System.out.println("true && false "+(true && false));
        System.out.println("true && true "+(true && true));
        
        /*
        OR ||
        0 0 = 0
        0 1 = 1
        1 0 = 1
        1 1 = 1
        */
        System.out.println("false || false "+(false || false));
        System.out.println("false || true "+(false || true));
        System.out.println("true || false "+(true || false));
        System.out.println("true || true "+(true || true));
        
        System.out.println("");
        /*
        XOR ^
        0 0 = 0
        0 1 = 1
        1 0 = 1
        1 1 = 0
        */
        System.out.println("false ^ false "+(false ^ false));
        System.out.println("false ^ true "+(false ^ true));
        System.out.println("true ^ false "+(true ^ false));
        System.out.println("true ^ true "+(true ^ true));
        
        System.out.println("not");
        System.out.println("! true "+(!true));
        System.out.println("! false "+(!false));
    }
}
