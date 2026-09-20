/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Base
{
    int data;
    public Base()
    {
        System.out.println("Base Default Constructor");
    }
    public Base(int data)
    {
        this.data = data;
    }
    void show()
    {
        System.out.println("Based data "+this.data);
    }
}
class Derived extends Base
{
    int data;
    public Derived()
    {
    }
    public Derived(int data)
    {
        this.data = data;
        System.out.println("Derived constructor");
    }
    void update()
    {
        data ++;
        super.data ++;
    }
}
class GrandChild extends Derived
{
    
}
public class Resolution {
    public static void main(String[] args) {
        Derived d = new Derived(100);
        d.update();
        System.out.println("D "+d.data);
        d.show();
    }
}
