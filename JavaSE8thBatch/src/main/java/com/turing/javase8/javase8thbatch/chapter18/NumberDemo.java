/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class NumberDemo {
    public static void main(String[] args) {
        Integer i = 12;
        Number num = i;
        System.out.println("Num "+i.intValue());
        System.out.println("I as binary "+Integer.toBinaryString(i));
        
        Float f= 3.1F;
        num = f;
        System.out.println("Float "+num.floatValue());
        
        String data = " 12.3 ";
        Double d = Double.parseDouble(data);
        System.out.println("Data "+d);
        
        f = Float.parseFloat(data);
        System.out.println("Data "+d);
        
        data = "FF";
        i = Integer.parseInt(data,16);
        System.out.println("I "+i);
    }
}
