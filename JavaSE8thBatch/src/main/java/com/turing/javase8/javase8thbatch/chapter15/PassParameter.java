/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter15;

/**
 *
 * @author macbook
 */
public class PassParameter {
    void hello()
    {
        System.out.println("Hello");
    }
    void acceptFn(Action action)
    {
        System.out.println("Accept function");
        action.action();
    }
    Action getAction()
    {
        System.out.println("getAction returned");
        return this::hello;
    }
    public static void main(String[] args) {
        PassParameter obj = new PassParameter();
        
        Action act = obj::hello;
        obj.acceptFn(act);
        
        obj.getAction().action();
    }
}
