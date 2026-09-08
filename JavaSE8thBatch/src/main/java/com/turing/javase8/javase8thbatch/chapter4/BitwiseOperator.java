/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 1;//1
        int b = 3;//11
        
        System.out.println("a "+ Integer.toBinaryString(a));
        System.out.println("b "+ Integer.toBinaryString(b));
        
        System.out.println("~a "+Integer.toBinaryString(~a));
        System.out.println("~a "+(~a));
        
        System.out.println("a & b "+ Integer.toBinaryString(a & b));
        System.out.println("a | b "+ Integer.toBinaryString(a | b));
        System.out.println("a ^ b "+ Integer.toBinaryString(a ^ b));
        
        System.out.println("a >>1 "+ Integer.toBinaryString(a>>1));
        System.out.println("b >>1 "+ Integer.toBinaryString(b>>1));
        
        int c = 10;
        System.out.println("c >>1 "+ Integer.toBinaryString(c>>1));
        System.out.println("c >>2 "+ (c>>2));
        
        System.out.println("a <<1 "+ Integer.toBinaryString(a<<1));
    }
}
