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
public class TypeErasure {
    public static void main(String[] args) {
        GenBox<String> strBox = new GenBox<>("Hello");
        GenBox<Date> dateBox = new GenBox<>(new Date());
        
        System.out.println("strBox "+ (strBox instanceof GenBox<String>));
        
        System.out.println("dateBox "+ (dateBox instanceof GenBox<?>));
    }
}
