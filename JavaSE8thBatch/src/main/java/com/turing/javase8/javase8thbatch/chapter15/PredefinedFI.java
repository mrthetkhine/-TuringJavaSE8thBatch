/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter15;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 *
 * @author macbook
 */
public class PredefinedFI {
    static String toUpper(String str)
    {
        return str.toUpperCase();
    }
    static Integer add(Integer x, Integer y)
    {
        return x+y;
    }
    static void display(String message)
    {
        System.out.println("Display "+message);
    }
    static Integer getData()
    {
        return 100;
    }
    static Integer len(String str)
    {
        return str.length();
    }
    static Boolean isEven(Integer x)
    {
        return x%2==0;
    }
    public static void main(String[] args) {
        UnaryOperator<String> unOp = PredefinedFI::toUpper;
        System.out.println("unOp "+unOp.apply("hello"));
        
        BinaryOperator<Integer> binOp = PredefinedFI::add;
        System.out.println("binOp "+binOp.apply(10, 20));
        
        Consumer<String> consumer = PredefinedFI::display;
        consumer.accept("Hello world");
        
        Supplier<Integer> supplier= PredefinedFI::getData;
        System.out.println("Supplier "+supplier.get());
        
        Function<String,Integer> fun = PredefinedFI::len;
        System.out.println("fun "+fun.apply("Hello World"));
        
        Predicate<Integer> pred = PredefinedFI::isEven;
        System.out.println("isEven "+pred.test(4));
    }
}
