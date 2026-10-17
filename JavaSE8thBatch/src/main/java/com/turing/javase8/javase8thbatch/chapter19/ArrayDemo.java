/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter19;

import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,9};
        int arr3[]={1,2,3,5,7,9};
        System.out.println("Binary Search "+ Arrays.binarySearch(arr, 5));
        
        int arr2[] = Arrays.copyOf(arr, 4);
        for(int a : arr2)
        {
            System.out.println("A "+a);
        }
        System.out.println("Equals "+Arrays.equals(arr, arr3));
        
        int[]arr4 = new int[5];
        Arrays.fill(arr4,4);
        for(int a : arr4)
        {
            System.out.println("Item "+a);
        }
    }
}
