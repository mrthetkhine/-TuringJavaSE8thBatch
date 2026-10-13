/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter18;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author macbook
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        Human h1 = new Human("Jhon",40);
        
        Class clazz = Human.class;
        Field[] fields= clazz.getDeclaredFields();
        
        for (Field field : fields) {
            System.out.println("Field "+field.getName()+ " type "+field.getType());
        }
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods)
        {
            System.out.println("Method name "+method.getName() +" Ret "+method.getReturnType());
        }
    }
}
