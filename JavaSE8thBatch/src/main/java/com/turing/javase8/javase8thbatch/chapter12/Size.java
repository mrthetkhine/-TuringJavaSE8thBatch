/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter12;

/**
 *
 * @author macbook
 */
public enum Size {
    Small(5),Medium(10),Large(15);
    
    private int cm;
    Size(int cm)
    {
        this.cm = cm;
    }
    public int getCm()
    {
        return this.cm;
    }
   
}
