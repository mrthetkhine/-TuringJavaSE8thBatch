/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter14;

/**
 *
 * @author macbook
 */
interface Min<T extends Number>
{
    boolean min(T a, T b);
            
}
class Minimum<T extends Number> implements Min<T>
{
    public boolean min(T a, T b)
    {
        return a.doubleValue() < b.doubleValue();
    }
}
public class GenInterfaceDemo {
    public static void main(String[] args) {
        Minimum<Integer> min =new Minimum<>();
        System.out.println("Min "+min.min(10, 20));
    }
}
