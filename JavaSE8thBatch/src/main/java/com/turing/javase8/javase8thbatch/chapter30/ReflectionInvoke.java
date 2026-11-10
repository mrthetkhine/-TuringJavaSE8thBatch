/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter30;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ReflectionInvoke {
    public static void main(String[] args) {
        try {
            Human h =new Human("Joe",12);
            Class<?> clazz = h.getClass();
            
            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            System.out.println("Value "+field.get(h));
            
            Method method = clazz.getMethod("display",null );
            System.out.println("Method "+method);
            method.invoke(h);
            
        } catch (Exception ex) {
            Logger.getLogger(ReflectionInvoke.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
