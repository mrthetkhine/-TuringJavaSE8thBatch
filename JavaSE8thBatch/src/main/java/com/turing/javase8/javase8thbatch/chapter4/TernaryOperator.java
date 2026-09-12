/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter4;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter num ");
        int num = scanner.nextInt();
        
        String result = (num % 2==0)?"Even":"Odd" ;
        /*
        if( num % 2==0)
        {
            result = "Even";
        }
        else
        {
            result = "Odd";
        }*/
        System.out.println("Result "+result);
    }
}
