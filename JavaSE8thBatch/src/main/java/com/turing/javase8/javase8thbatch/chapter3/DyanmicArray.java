/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class DyanmicArray {
    public static void main(String[] args) {
        int[]arr = new int[5];
        
        //arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 19;
        
        //System.out.println("Arr[0] "+arr[0]);
        
        for(int i=0;i < arr.length;i++)
        {
            System.out.println("Arr["+ i +"] "+arr[i]);
        }
    }
}
