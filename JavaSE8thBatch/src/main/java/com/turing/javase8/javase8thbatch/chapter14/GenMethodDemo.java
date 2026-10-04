/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter14;

import java.lang.reflect.Array;

/**
 *
 * @author macbook
 */
public class GenMethodDemo {
    static<T> boolean isBiggerSize(T[] arr1,T[] arr2)
    {
        return arr1.length > arr2.length;
    }
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1,2,3,4};
        Integer[] arr2 = new Integer[]{1,2};
        System.out.println("isBigger "+ isBiggerSize(arr1,arr2));
    }
}
