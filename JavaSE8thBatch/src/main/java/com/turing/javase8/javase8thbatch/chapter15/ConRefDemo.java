/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter15;

/**
 *
 * @author macbook
 */
class Human
{
    public Human()
    {
        System.out.println("Human constructor");
    }
}
class Teacher extends Human
{
    public Teacher()
    {
        System.out.println("Teacher constructor");
    }
}
interface Factory
{
    Human create();
}
public class ConRefDemo {
    public static void main(String[] args) {
        Factory fact = Human::new;
        Human h = fact.create();
        
        fact = Teacher::new;
        h = fact.create();
    }
}
