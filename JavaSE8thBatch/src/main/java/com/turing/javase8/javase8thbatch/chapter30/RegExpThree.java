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
public class RegExpThree {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("e.+d");
        Matcher mat =pattern.matcher("eid");
        System.out.println("Match "+mat.matches());
        System.out.println("Match extend "+pattern.matcher("extend").matches());
        System.out.println("Match end "+pattern.matcher("end").matches());
        System.out.println("Match enk "+pattern.matcher("enk").matches());
        System.out.println("Match ed "+pattern.matcher("ed").matches());
        
        mat = pattern.matcher("extend cup end");
        while(mat.find())
        {
            System.out.println("Match "+mat.group());
        }
        
    }
}
