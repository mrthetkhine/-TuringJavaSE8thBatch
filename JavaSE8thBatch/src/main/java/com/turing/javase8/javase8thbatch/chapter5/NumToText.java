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
public class NumToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter num");
        int num = scanner.nextInt();
        
        if(num ==1)
        {
            System.out.println("One");
        }
        else if( num ==2)
        {
            System.out.println("Two");
        }
        else if(num == 3)
        {
            System.out.println("Three");
        }
        else
        {
            System.out.println("Others");
        }
                
            
        
    }
}
