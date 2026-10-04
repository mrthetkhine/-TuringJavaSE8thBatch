/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class Tuple<T,V> extends GenBox<T>{
    V second;
    
    public Tuple(T first,V second)
    {
        super(first);
        this.second = second;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
    public static void main(String[] args) {
        Tuple<String,Integer> tuple= new Tuple<>("Hello",123);
        
        System.out.println("First "+tuple.getValue());
        System.out.println("Second "+tuple.getSecond());
    }
}
