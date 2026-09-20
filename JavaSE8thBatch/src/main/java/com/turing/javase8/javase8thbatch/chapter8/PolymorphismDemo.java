/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Human
{
    String name;
    public Human(String name)
    {
        this.name =name;
    }
    void work()
    {
        System.out.println("Human work");
    }
}
class Teacher extends Human
{
    String subject;
    public Teacher(String name, String subject)
    {
        super(name);
        this.subject = subject;
    }
    void work()
    {
        System.out.println("Teacher "+this.name+" teach "+this.subject);
    }
}
class Doctor extends Human
{
    String hospital;
    public Doctor(String name, String hospital)
    {
        super(name);
        this.hospital = hospital;
    }
    void work()
    {
        System.out.println("Doctor "+this.name+" treat patient in  "+this.hospital);
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Human h = new Human("U Ba");
        h.work();
        
        h = new Teacher("U Mya", "Math");
        h.work();
        
        h = new Doctor("U Win Naing","Victoria");
        h.work();
    }
}
