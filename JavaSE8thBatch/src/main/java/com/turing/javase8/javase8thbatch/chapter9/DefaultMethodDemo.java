/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface Action
{
    private void internalApi()
    {
        System.out.println("Private API");
    }
    default void action()
    {
        System.out.println("Action");
        this.internalApi();
    }
    static void staticMethod()
    {
        System.out.println("Static");
    }
}
class SomeAction implements Action
{
    
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        Action action = new SomeAction();
        action.action();
        
        Action.staticMethod();
        
    }
}
