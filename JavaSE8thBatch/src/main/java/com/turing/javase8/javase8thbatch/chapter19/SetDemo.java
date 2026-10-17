/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        set.add(3);
        set.add(1);
        set.add(2);
        
        set.add(1);
        set.add(2);
        
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Next "+iterator.next());
        }
        
        
        Integer[] arr = set.toArray(new Integer[set.size()]);
        for(Integer i : arr)
        {
            System.out.println("Item "+i);
        }
        System.out.println("Size "+set.size());
        System.out.println("isEmpty "+set.isEmpty());
        System.out.println("contains 2 "+set.contains(2));
        
    }
}
