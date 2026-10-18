/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.util.BitSet;

/**
 *
 * @author macbook
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet b1 = new BitSet(8);//10
        BitSet b2 = new BitSet(8);//11
        
        b1.set(1);
        b2.set(0);
        b2.set(1);
        b1.and(b2);
        
        System.out.println("B1 "+b1);
    }
}
