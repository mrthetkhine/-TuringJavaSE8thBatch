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
class ObjectBox
{
    Object value;
    public ObjectBox(Object value)
    {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
    
}
public class WhyGeneric {
    public static void main(String[] args) {
        ObjectBox str = new ObjectBox("Hello");
        ObjectBox dateBox = new ObjectBox(new Date());
        
        System.out.println("Get "+ ((Date)(str.value)).getDate());
    }
}
