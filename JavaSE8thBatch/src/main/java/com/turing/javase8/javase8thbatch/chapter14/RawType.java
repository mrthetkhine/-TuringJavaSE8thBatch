/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class RawType {
    public static void main(String[] args) {
        GenBox box = new GenBox(10);
        var box2 = new GenBox<>(10);
        
        System.out.println("Box "+box.value);
        System.out.println("Box2 "+box2.value);
    }
}
