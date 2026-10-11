/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter29;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author macbook
 */
public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(-4);
        list.add(5);
        
        Optional<Integer> total = list
                                    .stream()
                                    .filter(x->x%2==0)
                                    .reduce((a,b)->a+b);
        System.out.println("Total "+total.get());
        Optional<Integer> min = list
                                    .stream()
                                    .reduce((a,b)->a<b?a:b);
        System.out.println("Min "+min.get());
        
    }
}
