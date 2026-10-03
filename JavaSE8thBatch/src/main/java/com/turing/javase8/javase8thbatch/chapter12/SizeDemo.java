/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class SizeDemo {
    public static void main(String[] args) {
        Size size = Size.Small;
        
        System.out.println("Size "+size);
        System.out.println("Size in cm "+size.getCm());
        
        if(Size.Small.compareTo(Size.Medium) < 0 )
        {
            System.out.println("Small < Medium");
        }
        System.out.println("Ordinal "+Size.Medium.ordinal());
    }
}
