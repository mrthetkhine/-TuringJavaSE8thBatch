/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class LabelLoop {
    public static void main(String[] args) {
        outer:for (int i = 0; i < 10; i++) {
            System.out.println("Outer i "+i);
            for (int j = 0; j < 20; j++) {
                System.out.println("Inner j "+j);
                if(j==5)
                {
                    break outer;
                }
            }
        }
    }
}
