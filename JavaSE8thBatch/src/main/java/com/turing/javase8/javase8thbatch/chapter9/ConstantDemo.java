/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface Size
{
    int Small = 10;
    int Middle = 20;
    int Large = 30;
}
public class ConstantDemo {
    public static void main(String[] args) {
        int size = Size.Small;
        //Size.Small++;
        
        System.out.println("Size "+size);
    }
}
