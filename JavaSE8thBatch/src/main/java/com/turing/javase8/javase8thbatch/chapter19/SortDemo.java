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
public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.sort((a,b)-> b-a);
        
        for(Integer i: list)
        {
            System.out.println("Item "+i);
        }
        
        List<String> strList = new ArrayList<>();
        strList.add("banana");
        strList.add("orange");
        strList.add("apple");
        
        strList.sort((a,b)->a.compareTo(b));
        
        for(String i: strList)
        {
            System.out.println("Item "+i);
        }
    }
}
