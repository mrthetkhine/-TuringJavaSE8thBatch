/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter13;

/**
 *
 * @author macbook
 */
public class Box {
    int width;
    int height;
    
    public Box()
    {
    }
    public Box(int width,int height)
    {
        this.width = width;
        this.height =height;
        System.out.println("Two arg constuctor");
    }
    public Box(int width)
    {
        this(width,0);
        System.out.println("One arg constuctor");
    }
    public static void main(String[] args) {
        Box box  =new Box(10,1);
    }
}
