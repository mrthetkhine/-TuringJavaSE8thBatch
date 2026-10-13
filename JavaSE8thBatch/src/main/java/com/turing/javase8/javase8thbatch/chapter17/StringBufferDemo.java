/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String str = "";
        
        //Thread Safe
        //StringBuffer buffer = new StringBuffer();
        
        StringBuilder buffer = new StringBuilder();
        long start = System.currentTimeMillis();
        System.out.println("Free "+r.freeMemory());
        for (int i = 0; i < 100_000; i++) {
            str += i;
            //buffer.append(i);
        }
        long end = System.currentTimeMillis();
        long time = end-start;
        System.out.println("After Free "+r.freeMemory());
        System.out.println("Time "+time);
        
        
    }
}
