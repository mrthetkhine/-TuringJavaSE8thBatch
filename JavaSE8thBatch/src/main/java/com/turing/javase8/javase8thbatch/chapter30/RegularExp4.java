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
public class RegularExp4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s+");
      
        System.out.println(pattern+" Match   "+pattern.matcher("    ").matches());
        System.out.println(pattern+" Match 10022A "+pattern.matcher("10022A").matches());
        
        pattern = Pattern.compile("\\S+");
      
        System.out.println(pattern+" Match   "+pattern.matcher("    ").matches());
        System.out.println(pattern+" Match 10022A "+pattern.matcher("10022A").matches());
        
        pattern = Pattern.compile("\\w+");
      
        System.out.println(pattern+" Match  12# "+pattern.matcher("12#").matches());
        System.out.println(pattern+" Match 10022A "+pattern.matcher("10022A").matches());
        
        pattern = Pattern.compile("\\W+");
      
        System.out.println(pattern+" Match  @#$# "+pattern.matcher("@#$#").matches());
        System.out.println(pattern+" Match 10022A "+pattern.matcher("10022A").matches());
        
        pattern = Pattern.compile("^Java");
      
        Matcher mat =pattern.matcher("Java and JavaScript");
        while(mat.find())
        {
            System.out.println(pattern+" Mat.group() "+mat.group());
        }
        pattern = Pattern.compile("Script$");
      
        mat =pattern.matcher("Java and JavaScript");
        while(mat.find())
        {
            System.out.println(pattern+" Mat.group() "+mat.group());
        }
        
        pattern = Pattern.compile("\\bJava");
      
        mat =pattern.matcher("Java and JavaScript and HelloJava");
        while(mat.find())
        {
            System.out.println(pattern+" Mat.group() "+mat.group());
        }
        
        pattern = Pattern.compile("\\BJava");
      
        mat =pattern.matcher("Java and JavaScript and HelloJava");
        while(mat.find())
        {
            System.out.println(pattern+" Mat.group() "+mat.group() + " index "+mat.start());
        }
    }
}
