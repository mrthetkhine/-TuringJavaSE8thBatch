/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        
        map.put(1, "user1");
        map.put(2, "user2");
        map.put(3, "user3");
        
        System.out.println("Key 1 "+map.get(1));
        
        map.put(1, "userone");
        System.out.println("Key 1 "+map.get(1));
        
        for(String value: map.values())
        {
            System.out.println("Value "+value);
        }
        for(Integer key: map.keySet())
        {
            System.out.println("Key "+key);
        }
        for(Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.println("Key "+entry.getKey()+" Value "+entry.getValue());
        }
    }
}
