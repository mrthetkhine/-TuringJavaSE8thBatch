/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.util.ListResourceBundle;

/**
 *
 * @author macbook
 */
public class SimpleRB_en_US extends ListResourceBundle
{

    @Override
    protected Object[][] getContents() {
        Object[][] resources = new Object[2][2];
        
        resources[0][0] ="Title";
        resources[0][1] ="My Program";
        
        resources[1][0] ="Stop Text";
        resources[1][1] ="Stop";
        
        return resources;
    }
    
}
