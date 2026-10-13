/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Cos 90 "+Math.cos(Math.toRadians(90) ));
        System.out.println("sin 90 "+Math.sin(Math.toRadians(90) ));
        
        Package[]packages= Package.getPackages();
        for(Package pac : packages)
        {
            System.out.println("Pac "+pac);
        }
    }
}
