/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class WildCard<T extends Number> {
    T[] arr;
    
    WildCard(T[] arr)
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
    boolean sameAverage(WildCard<?> another)
    {
        return this.average() == another.average();
    }
    
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1,2,3,4};
        Integer arr2[] = new Integer[]{1,2,3,4};
        Double dArr[] = new Double[]{1.0,2.0,3.0,4.0};
        
        WildCard<Integer> stats = new WildCard(arr);
        WildCard<Integer> stats2 = new WildCard(arr2);
        WildCard<Double> stats3 = new WildCard(dArr);
        
        System.out.println("Averge "+stats.average());
        
        System.out.println("Same Average "+stats.sameAverage(stats2));
        System.out.println("Same Average "+stats.sameAverage(stats3));
        
        //Stats<String> statString;
    }
}
