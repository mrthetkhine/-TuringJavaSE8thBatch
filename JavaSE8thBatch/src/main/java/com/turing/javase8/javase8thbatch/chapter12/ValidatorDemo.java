/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class ValidatorDemo {
    public static void main(String[] args) {
        Human h = new Human("",null);
        Student stud = new Student(null,null);
        
        Validator validator = new Validator();
        validator.validate(h);
    }
}
