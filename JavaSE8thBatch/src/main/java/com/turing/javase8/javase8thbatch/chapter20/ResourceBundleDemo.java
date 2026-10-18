/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author macbook
 */

public class ResourceBundleDemo {
    public static void main(String[] args) {
        Locale en_US = new Locale("en", "US");
        ResourceBundle bundle= ResourceBundle.getBundle("com.turing.javase8.javase8thbatch.chapter20.SimpleRB",Locale.GERMAN);
        System.out.println("Title "+bundle.getString("Title"));
                
    }
}
