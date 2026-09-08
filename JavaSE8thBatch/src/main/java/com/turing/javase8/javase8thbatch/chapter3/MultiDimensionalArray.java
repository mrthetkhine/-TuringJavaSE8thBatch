/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        
        int []arr[] = {
            {1,2,3,4,10,11,12},
            {5,6,7,8},
            {9,10,11,12},
        };
        System.out.println("Arr.length "+arr.length);
        
        System.out.println("Arr[0] "+arr[0][0]);
        System.out.println("Arr[1][2] "+arr[1][2]);
        System.out.println("Arr[2][3] "+arr[2][3]);
        
        for (int i = 0; i < arr.length; i++) {//row
            for (int j = 0; j < arr[i].length; j++) {//colum
                System.out.println("Arr ["+i+"]["+j+ "] "+arr[i][j]);
            }
        }
    }
}
