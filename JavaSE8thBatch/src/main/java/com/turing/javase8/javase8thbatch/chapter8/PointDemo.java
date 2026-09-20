/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter8;

/**
 *
 * @author macbook
 */
class TwoD
{
    int x,y;
    public TwoD(int x,int y)
    {
        this.x = x;
        this.y = y;
        System.out.println("TwoD Constructor");
    }
    void show()
    {
        System.out.println("x "+this.x+" y "+this.y);
    }
}
class ThreeD extends TwoD
{
    int z;
    public ThreeD(int x,int y, int z)
    {
        super(x,y);
        this.z = z;
       
        System.out.println("ThreeD Contructor");
    }
    void show()
    {
        //super.show();
        System.out.println("x "+this.x+" y "+this.y+" z "+this.z);
    }
}
public class PointDemo {
    public static void main(String[] args) {
        TwoD twoD = new TwoD(10,20);
        twoD.show();
        
        ThreeD threeD = new ThreeD(10,20,30);
        threeD.show();
        
        twoD = threeD;
        twoD.show();
    }
}
