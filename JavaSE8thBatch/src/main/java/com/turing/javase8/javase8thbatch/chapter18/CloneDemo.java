/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter18;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */

public class CloneDemo {
    public static void main(String[] args) {
        Human h1 = new Human("Jhon",40);
        Human h2 = h1.createCopy();
        
        System.out.println("h2 "+h2);
    }
}
