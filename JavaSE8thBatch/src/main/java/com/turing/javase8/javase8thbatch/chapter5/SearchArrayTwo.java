/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter5;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class SearchArrayTwo {
    public static void main(String[] args) {
         int[] arr = {1,2,10,11,120,3};
        
        Scanner scanner =new Scanner(System.in);
        
        int input;
        
        System.out.println("Enter num to search");
        input = scanner.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Search "+arr[i]);
            if(arr[i]== input)
            {
                System.out.println("Found at index "+i);
                break;
            }
            
        }
        System.out.println("End");
    }
}
