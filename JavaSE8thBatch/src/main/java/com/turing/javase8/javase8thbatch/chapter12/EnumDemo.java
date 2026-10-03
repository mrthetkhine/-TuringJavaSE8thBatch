/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter12;

/**
 *
 * @author macbook
 */
enum Gender
{
    Male,Female;
}
public class EnumDemo {
    public static void main(String[] args) {
        /*
        int gender = 0;//female 1;
        gender = 13;
        
        System.out.println("Gender "+gender);
        */
        Gender gender = Gender.Male;
        //gender =100;
        System.out.println("Gender "+gender);
        
        if(gender== Gender.Male)
        {
            System.out.println("It is male");
        }
        String value = "Female";
        gender = Gender.valueOf(value);
        System.out.println("Gender "+gender);
        
        for(Gender g: Gender.values())
        {
            System.out.println("Value "+g);
        }
    }
}
