/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Outer
{
    int outerX =10;
    
    void outerMethod()
    {
        Inner inner  =new Inner();
        inner.innerMethod();
    }
    class Inner
    {
        int innerX = 50;
        
        void innerMethod()
        {
            System.out.println("Inner method ");
            System.out.println("Innerx "+this.innerX);
            System.out.println("OuterX "+outerX);
            
        }
    }
    public static class StaticInner
    {
        void process()
        {
            System.out.println("Process ");
        }
    }
}
public class NestedClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
        
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.process();
       
    }
}
