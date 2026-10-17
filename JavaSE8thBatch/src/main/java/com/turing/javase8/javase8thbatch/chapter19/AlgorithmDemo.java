/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author macbook
 */
public class AlgorithmDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(list,r);
        
        for(Integer i : list)
        {
            System.out.println("Item "+i);
        }
        
        Collections.shuffle(list);
        System.out.println("After");
        for(Integer i : list)
        {
            System.out.println("Item "+i);
        }
        System.out.println("Max "+Collections.max(list));
        System.out.println("Min "+Collections.min(list));
    }
}
