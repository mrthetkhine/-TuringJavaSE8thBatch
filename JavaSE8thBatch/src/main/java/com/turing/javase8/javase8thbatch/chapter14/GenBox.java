/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter14;

import java.util.Date;

/**
 *
 * @author macbook
 */
public class GenBox<T> {
    T value;
    
    public GenBox(T value)
    {
        this.value= value;
    }
    T getValue()
    {
        return this.value;
    }
    
    public static void main(String[] args) {
        GenBox<String> strBox = new GenBox<>("Hello");
        
        GenBox<Date> dateBox = new GenBox<>(new Date());
        //strBox = dateBox;
        
        System.out.println("StrBox "+strBox.getValue().toUpperCase());
        System.out.println("DateBox "+dateBox.getValue().getDate());
        
        GenBox<Integer> intBox = new GenBox<>(0);
        
        System.out.println("StrClass "+strBox.getClass());
        System.out.println("DateClass "+dateBox.getClass());
    }
}
