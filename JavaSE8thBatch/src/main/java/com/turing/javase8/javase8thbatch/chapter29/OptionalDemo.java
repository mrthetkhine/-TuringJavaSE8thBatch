/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter29;

import java.util.Optional;

/**
 *
 * @author macbook
 */
public class OptionalDemo {
    static String appendHi(String str)
    {
        System.out.println("AppendHi");
        return str.concat(" hi");
    }
    static Integer len(String str)
    {
        System.out.println("Len");
        return str.length();
    }
    public static void main(String[] args) {
        String input = "hello";
        /*
        String result = appendHi(input);
        Integer length = len(result);
        
        System.out.println("Length "+length);
        */
        
        Optional<Integer> opt = Optional.ofNullable(input)
                                       .map(OptionalDemo::appendHi) 
                                       .map(OptionalDemo::len); 
        if(opt.isPresent())
        {
            System.out.println("Result "+opt.get());
        }
    }
}
