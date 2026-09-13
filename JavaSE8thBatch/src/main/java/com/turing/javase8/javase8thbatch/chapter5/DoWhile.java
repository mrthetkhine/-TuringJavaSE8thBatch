/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class DoWhile {
    public static void main(String[] args) {
        Random random = new Random();
        
        int num = random.nextInt(10)+1;
        
        int input;
        Scanner scanner =new Scanner(System.in);
        //System.out.println("Num "+num);
        int count=0;
        do
        {
            count ++;
            System.out.println("Enter num to guess");
            input = scanner.nextInt();
            
            if(input > num)
            {
                System.out.println("Too high");
            }
            else if(input < num)
            {
                System.out.println("Too low");
            }
            
        }while(num != input);
        System.out.println("Correct at guess "+count);
        
    }
}
