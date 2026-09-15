/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Rectangle {
    int width,height;
    
    public Rectangle()
    {
        System.out.println("Default Constructor");
    }
    public Rectangle(int width,int height)
    {
        this.width = width;
        this.height = height;
        System.out.println("Constructor");
    }
    
    void setWidthAndHeight(int width,int height)
    {
        this.width = width;
        this.height = height;
    }
    int area()
    {
        return this.width * this.height; 
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        
        //r1.setWidthAndHeight(10, 20);
      
        
        Rectangle r2= new Rectangle(20,30);
        //r2.setWidthAndHeight(20, 30);
        
        System.out.println("R1.area "+r1.area());
        System.out.println("R2.area "+r2.area());
        
        Rectangle r3 = new Rectangle();
    }
}
