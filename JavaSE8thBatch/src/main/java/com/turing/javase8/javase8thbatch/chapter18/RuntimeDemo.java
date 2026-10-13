/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter18;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class RuntimeDemo {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("mkdir hello");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
