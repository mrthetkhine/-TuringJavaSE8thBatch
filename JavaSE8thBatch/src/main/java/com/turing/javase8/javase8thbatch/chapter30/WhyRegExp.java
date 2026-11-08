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
public class WhyRegExp {
    static boolean isValidPhoneNo(String input)
    {
        for(int i=0;i< input.length();i++)
        {
            char ch = input.charAt(i);
            if(!Character.isDigit(ch))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("isValidPhone 10022 "+isValidPhoneNo("10022"));
        System.out.println("isValidPhone 10022A "+isValidPhoneNo("10022A"));
        
        Pattern pattern = Pattern.compile("\\d+");
        Matcher mat =pattern.matcher("1022");
        System.out.println("Match "+mat.matches());
        System.out.println("Match 10022A "+pattern.matcher("10022A").matches());
        System.out.println("find "+pattern.matcher("10022A").find());
    }
}
