/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class EorrHandling {
    static Pair<Integer,RuntimeException> div(int a, int b)
    {
        if(b==0)
        {
            return new Pair(0,new RuntimeException("division by zero"));
        }
        else
        {
            return new Pair(a/b,null);
        }
    }
    public static void main(String[] args) {
        Pair<Integer,RuntimeException> result = div(10,2);
        if(result.getSecond() !=null)
        {
            System.out.println("Error "+result.getSecond().getMessage());
        }
        else
        {
            System.out.println("Result "+result.getFirst());
        }
    }
    
}
