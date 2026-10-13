/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class WhyCollections {
    public static void main(String[] args) {
        /*
        int[]arr = new int[5];
        arr[5]=10;
        */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        
        list.addAll(list2);
        
        list.remove(0);
        for(Integer i: list)
        {
            System.out.println("I "+i);
        }
        System.out.println("Contains "+list.containsAll(list2));
        
        //list.removeAll(list2);
        list.removeIf(x->x>3);
        for(Integer i: list)
        {
            System.out.println("I=> "+i);
        }
        System.out.println("Size "+list.size());
        Integer[] arr = list.toArray(new Integer[list.size()]);
        
        for(Integer i: arr)
        {
            System.out.println("I=> "+i);
        }
    }
}
