/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter30;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

/**
 *
 * @author macbook
 */
public class ReflectionDemo {
    public static void main(String[] args)  {
        try
        {
            Class<?> dateClass = Class.forName("java.util.Date");
            Constructor<?>[] constructors =dateClass.getConstructors();
            
            for(Constructor con: constructors)
            {
                System.out.println("Con "+con);
            }
            Date date =(Date) dateClass.newInstance();
            System.out.println("Date "+date);
            
            Field[] fields = dateClass.getDeclaredFields();
            for(Field field: fields)
            {
                System.out.println("Field "+field);
            }
            Method[] methods = dateClass.getMethods();
            for(Method method: methods)
            {
                System.out.println("Method "+method);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
