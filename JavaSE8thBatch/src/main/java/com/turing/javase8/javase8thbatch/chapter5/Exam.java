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
public class Exam {
    public static void main(String[] args) {
        int myan,eng, math;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter myan");
        myan = scanner.nextInt();
        
        System.out.println("Enter eng");
        eng = scanner.nextInt();
        
        System.out.println("Enter math ");
        math = scanner.nextInt();
        
        if(myan >= 40 && eng >= 40 && math >=40)
        {
            System.out.println("Pass");
            if(myan >= 75 || eng >=75 ||  math >=75)
            {
                System.out.println("Got distinction");
            }
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
