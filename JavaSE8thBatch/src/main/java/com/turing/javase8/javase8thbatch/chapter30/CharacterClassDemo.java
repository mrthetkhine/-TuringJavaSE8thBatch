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
public class CharacterClassDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher mat =pattern.matcher("1022");
        System.out.println("Match "+mat.matches());
        System.out.println("Match 10022A "+pattern.matcher("10022A").matches());
        System.out.println("find "+pattern.matcher("10022A").find());
        
        pattern = Pattern.compile("[a-z]+");
        mat =pattern.matcher("this is a test");
        while(mat.find())
        {
            System.out.println("Mat.group() "+mat.group());
        }
        
        pattern = Pattern.compile("[+\\-*/]+");
        String input = "10+2+3-4*2/100";
        String parts[]=input.split("[+\\-*/]+");
        
        for(String part: parts)
        {
            System.out.println("Part "+part);
        }
        
        pattern = Pattern.compile("[^abc]+");
     
        System.out.println("Match 10022A "+pattern.matcher("10022A").matches());
        System.out.println("find 10022A "+pattern.matcher("10022A").find());
        System.out.println("find a12 "+pattern.matcher("a12").matches());
        
        pattern = Pattern.compile("\\d+");
        mat =pattern.matcher("1022");
        System.out.println("Match 1022 "+mat.matches());
        System.out.println("Match 10022A "+pattern.matcher("10022A").matches());
        
        pattern = Pattern.compile("\\D+");
      
        System.out.println(pattern+" Match 1022 "+pattern.matcher("1022").matches());
        System.out.println(pattern+" Match 10022A "+pattern.matcher("10022A").matches());
        System.out.println(pattern+" Match abac "+pattern.matcher("abac").matches());
       
    }
}
