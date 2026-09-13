/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class ForEach {
    public static void main(String[] args) {
        int [] arr = {1,10,20,30,40};
        
        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ele "+arr[i]);
        }
        */
        for(final int ele : arr)//int ele = arr[i];
        {
           
            System.out.println("Ele "+ele);
            //ele *= 2;
        }
        System.out.println("Arr[0] "+arr[0]);
    }
}
