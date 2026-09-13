/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class LoopMatrix {
    public static void main(String[] args) {
        
        int[][] arr = {
            {1,2,3,5,7,8,9,10},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" , ");
            }
            System.out.println();
        }
        
    }
}
