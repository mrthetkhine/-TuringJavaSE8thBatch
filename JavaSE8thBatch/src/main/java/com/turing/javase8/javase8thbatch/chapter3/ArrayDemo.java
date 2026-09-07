/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class ArrayDemo {
    public static void main(String[] args) {
        /*
        int age0 = 20;
        int age1 = 21;
        int age2 = 19;
        */
        
        int[] ages = {20,21,19};
        
        System.out.println("ages[0] "+ages[0]);
        System.out.println("ages[1] "+ages[1]);
        System.out.println("ages[2] "+ages[2]);
        
        int total = 0;
        for(int age : ages)
        {
            total += age;
        }
        System.out.println("Length "+ages.length);
        System.out.println("Averge age "+(total/ages.length));
    }
}
