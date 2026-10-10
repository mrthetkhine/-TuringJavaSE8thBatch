/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface GenMap<T>
{
    T map(T data);
}
interface GenTwoMap<T,V>
{
    T map(V data);
}
public class GenFIDemo {
    static String toUpper(String str)
    {
        return str.toUpperCase();
    }
    static Integer inc(Integer x)
    {
        return x+1;
    }
    static Integer length(String str)
    {
        return str.length();
    }
    static String toString(Integer x)
    {
        return x+"";
    }
    public static void main(String[] args) {
        GenMap<String> strMap = GenFIDemo::toUpper;
        System.out.println("Upper "+strMap.map("hello"));
        
        GenMap<Integer> intMap = GenFIDemo::inc;
        System.out.println("Inc "+intMap.map(10));
        
        GenTwoMap<String,Integer> map2 = GenFIDemo::toString;
        System.out.println("Map2 "+ map2.map(100));
        
        GenTwoMap<Integer,String> mapLength = GenFIDemo::length;
        System.out.println("Map Length "+mapLength.map("Hello"));
    }
}
