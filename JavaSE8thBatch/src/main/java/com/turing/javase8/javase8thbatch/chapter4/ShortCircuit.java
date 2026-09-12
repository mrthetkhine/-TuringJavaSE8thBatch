/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class ShortCircuit {
    
    static boolean getTrue()
    {
        System.out.println("GetTrue");
        return true;
    }
    static boolean getFalse()
    {
        System.out.println("GetFalse");
        return false;
    }
    public static void main(String[] args) {
        //System.out.println("getTrue "+getTrue());
        //System.out.println("getFalse "+getFalse());
        
        System.out.println("getFalse & getFalse() "+ (getFalse() & getFalse()));
        System.out.println("getFalse && getFalse() "+ (getFalse() && getFalse()));
        System.out.println("getFalse && getTrue() "+ (getFalse() && getTrue()));
        
        System.out.println("");
        System.out.println("getTrue() && getFalse() "+(getTrue() && getFalse()));
        System.out.println("getTrue() && getTrue() "+(getTrue() && getTrue()));
        
        System.out.println("||");
        System.out.println("getTrue() || getFalse() "+(getTrue() || getFalse()));
        System.out.println("getTrue() || getTrue() "+(getTrue() || getTrue()));
        
        System.out.println("");
        System.out.println("getFalse() || getFalse() "+(getFalse() || getFalse()));
        System.out.println("getFalse() || getTrue() "+(getFalse() || getTrue()));
    }
}
