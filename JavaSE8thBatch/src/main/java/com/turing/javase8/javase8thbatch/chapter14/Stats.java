/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class Stats<T extends Number> {
    T[] arr;
    
    Stats(T[] arr)
    {
        this.arr = arr;
    }
    double average()
    {
        double total =0;
        for(int i=0;i< arr.length;i++)
        {
            total += arr[i].doubleValue();
        }
        return total/arr.length;
    }
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1,2,3,4};
        
        Stats<Integer> stats = new Stats(arr);
        System.out.println("Averge "+stats.average());
        
        //Stats<String> statString;
    }
}
