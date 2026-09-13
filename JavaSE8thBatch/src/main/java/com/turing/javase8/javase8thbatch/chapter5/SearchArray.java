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
public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {1,2,10,11,120,3};
        
        Scanner scanner =new Scanner(System.in);
        
        int input;
        
        System.out.println("Enter num to search");
        input = scanner.nextInt();
        
        boolean found = false;
        int index = 0;
        
        while(!found && index < arr.length)
        {
            if(arr[index]== input)
            {
                found = true;
            }
            index ++;
        }
        if(found)
        {
            System.out.println("Found at "+(index-1)) ;
        }
        else
        {
            System.out.println("Not found");
        }
        
        
    }
}
