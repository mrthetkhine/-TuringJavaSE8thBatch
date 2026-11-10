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
public class RegularExp5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d*");
      
    
        Matcher mat =pattern.matcher("Java 1012 hello1");
        while(mat.find())
        {
            System.out.println(pattern+" Mat.group() "+mat.group());
        }
        System.out.println(pattern+" Match   "+pattern.matcher("").matches());
        System.out.println(pattern+" Match 10022A "+pattern.matcher("10022").matches());
        
        pattern = Pattern.compile("\\d?");
        System.out.println(pattern+" Match   "+pattern.matcher("").matches());
        System.out.println(pattern+" Match 10022A "+pattern.matcher("10022").matches());
        System.out.println(pattern+" Match 1 "+pattern.matcher("1").matches());
        
        pattern = Pattern.compile("([ABC])+(\\d)+",Pattern.CASE_INSENSITIVE);
        System.out.println(pattern+" Match AAC1 "+pattern.matcher("AAC1").matches());
        System.out.println(pattern+" Match aac1 "+pattern.matcher("aac1").matches());
        System.out.println(pattern+" Match AAC "+pattern.matcher("AAC").matches());
    }
}
