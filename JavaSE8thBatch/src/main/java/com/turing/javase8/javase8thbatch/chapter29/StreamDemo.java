/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(12);
        list.add(3);
        list.add(4);
        list.add(5);
        
        for (Integer x : list) {
            System.out.println("x "+x);
        }
        /*
            list.remove(1);
            System.out.println("===");
            for (Integer x : list) {
                System.out.println("x "+x);
            }
        */
        Stream<Integer> result = list.stream()
                                     .filter(x->x%2==0)
                                     .map(x->x*2);
        
        result.forEach(x->System.out.println("x is "+x));
        
        Optional<Integer> maxResult = list.stream().max(Integer::compare);
        if(maxResult.isPresent())
        {
            System.out.println("Max "+maxResult.get());
        }
        
        list.stream()
            .sorted()
            .forEach(System.out::println);
    }
}
