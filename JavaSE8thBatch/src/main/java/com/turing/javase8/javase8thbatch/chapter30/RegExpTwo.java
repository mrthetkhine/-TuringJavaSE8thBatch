/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author macbook
 */
public class RegExpTwo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("test");
        Matcher mat =pattern.matcher("test 1 2 3 test");
        while(mat.find())
        {
            System.out.println("Found at index "+mat.start());
        }
        
        pattern = Pattern.compile("W+");
        mat =pattern.matcher("W WW WWWW");
        while(mat.find())
        {
            System.out.println("Found at index "+mat.start());
        }
    }
}
