/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface Flyable
{
    void fly();
}
interface Playing
{
    void play();
}
interface FlyableWithEat extends Flyable,Playing
{
    void eat();
}
class Bird implements FlyableWithEat,Playing
{

    @Override
    public void fly() {
        System.out.println("Birdy fly");
    }

    @Override
    public void eat() {
        System.out.println("Bird eating");
    }

    @Override
    public void play() {
        System.out.println("Bird play");
    }
}
class Aeroplane implements Flyable
{
    @Override
    public void fly() {
        System.out.println("Aeroplane fly");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();
        
        flyable = new Aeroplane();
        flyable.fly();
    }
}
