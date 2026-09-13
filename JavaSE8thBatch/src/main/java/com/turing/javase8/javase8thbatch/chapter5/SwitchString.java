/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class SwitchString {
    public static void main(String[] args) {
        String msg = new String("one");
        
        switch(msg)
        {
            case "one":
                System.out.println("1");
            break;
            case "two":
                System.out.println("2");
            break;
            default:
                System.out.println("Others");
            
        }
    }
}
