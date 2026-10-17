/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ListVsMapDemo {
    public static void main(String[] args) {
        /*
        List<String> list = new ArrayList<>();
        
        for(int i=0;i<500_000;i++)
        {
            list.add(i+"");
        }
        
        long start = System.currentTimeMillis();
        boolean exist = list.contains("499999");
        long end = System.currentTimeMillis();
        
        long time = (end-start);
        System.out.println("Exist "+exist+" time "+time);
        */
        HashMap<String,Boolean> map = new HashMap<>();
        for(int i=0;i<500_000;i++)
        {
            map.put(i+"",true);
        }
        long start = System.currentTimeMillis();
        boolean exist = map.containsKey("499999");
        long end = System.currentTimeMillis();
        
        long time = (end-start);
        System.out.println("Exist "+exist+" time "+time);
    }
}
