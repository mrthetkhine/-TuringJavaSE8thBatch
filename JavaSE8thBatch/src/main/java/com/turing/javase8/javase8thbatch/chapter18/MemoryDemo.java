/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class MemoryDemo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        //System.out.println("Total "+rt.totalMemory());
        //System.out.println("Free "+rt.freeMemory());
        
        System.out.println("Version "+Runtime.version());
        
        int arr [] = {1,2,3,4,5,6};
        int arr2[] = new int[6];
        System.arraycopy(arr, 0, arr2, 0, arr2.length);
        for(int i: arr2)
        {
            System.out.println("i "+i);
        }
        System.out.println("JavaHome "+System.getProperty("java.home"));
        System.out.println("JavaHome "+System.getProperty("user.home"));
    }
}
