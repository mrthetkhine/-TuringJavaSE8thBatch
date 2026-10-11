/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class CollectDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(-4);
        list.add(5);
        list.add(2);
        
        List<Integer> list2 = list
                                 .stream()
                                 .filter(x->x%2==0)
                                 .collect(Collectors.toList());
        list2.forEach(System.out::println);
        
        Set<Integer> set = list
                                 .stream()
                                 .filter(x->x%2==0)
                                 .collect(Collectors.toSet());
        for(Integer i:set)
        {
            System.out.println("Set "+i);
        }
        
        Stream<Integer> stream = list.stream();
        Iterator<Integer> iterator = stream.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Next "+iterator.next());
        }
        
        Spliterator<Integer> spliterator = list.spliterator();
        while(spliterator.tryAdvance(i->System.out.println("Spliterator "+i)));
    }
}
