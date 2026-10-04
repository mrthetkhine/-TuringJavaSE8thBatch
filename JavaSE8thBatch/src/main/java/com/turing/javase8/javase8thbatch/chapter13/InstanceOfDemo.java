/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter13;

import java.util.Date;

import static java.lang.System.out;
import static java.lang.Math.*;
/**
 *
 * @author macbook
 */
class Human
{
}
class Student extends Human
{
}
class Teacher extends Human
{
}
public class InstanceOfDemo {
    public static void main(String[] args) {
        Human h = new Student();
        
        out.println("h instanceof Human "+ (h instanceof Human));
        out.println("h instanceof Student "+ (h instanceof Student));
        System.out.println("h instanceof Object "+ (h instanceof Object));
        
        h = new Teacher();
        System.out.println("h instanceof Student "+ (h instanceof Student));
        System.out.println("h instanceof Teacher "+ (h instanceof Teacher));
        //System.out.println("h instanceof Date "+ (h instanceof Date));
        System.out.println("null instanceof Object "+ (null instanceof Object));
        
        System.out.println("cos(0) "+cos(0));
    }
}
