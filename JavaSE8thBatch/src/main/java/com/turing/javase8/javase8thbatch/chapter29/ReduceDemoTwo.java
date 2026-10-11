/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter29;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */

public class ReduceDemoTwo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("blue berry");
        fruits.add("mango");
        
        fruits.stream()
               .filter(str->str.length()>5)
               .forEach(System.out::println);
    }
}
