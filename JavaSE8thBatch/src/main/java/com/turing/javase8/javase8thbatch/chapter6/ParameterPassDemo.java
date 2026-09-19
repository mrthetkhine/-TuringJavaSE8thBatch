/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Computation
{
    int getOne()
    {
        System.out.println("getOne");
        return 1;
    }
    //a = 10
    //b = 2;
    int add(int a,int b)
    {
        System.out.println("A "+a+" b "+b);
        return a+b;
    }
    void inc(int a)
    {
        a++;
    }
    void inc(Data data)
    {
        System.out.println("Data "+data);
        data.value++;
    }
    Data inc2(Data data)
    {
        System.out.println("Data "+data);
        data = new Data(300);
        
        return data;
    }
}
public class ParameterPassDemo {
    public static void main(String[] args) {
        
        Computation comp = new Computation();
        
        int result = comp.add(10,2);
        System.out.println("Result "+result);
        
        int b =10;
        comp.inc(b);//a=b // a++
        
        System.out.println("Inc "+b);
        
        Data obj = new Data(10);
        comp.inc(obj);
        
        System.out.println("Obj "+obj);
        System.out.println("Data "+obj.value);
        
        comp.inc2(obj);
        System.out.println("Data "+obj.value);
        
        obj = comp.inc2(obj);
        System.out.println("Data "+obj.value);
        
    }
}
