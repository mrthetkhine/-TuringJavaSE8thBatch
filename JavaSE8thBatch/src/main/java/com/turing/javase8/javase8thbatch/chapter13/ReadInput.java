/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter13;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class ReadInput {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter name ");
        name = scanner.next();
        
        System.out.println("Enter Age ");
        age = scanner.nextInt();
        
        System.out.println("Name "+name + " age "+age);
    }
}
