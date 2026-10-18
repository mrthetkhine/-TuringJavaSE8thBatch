/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.util.Random;
import java.util.UUID;

/**
 *
 * @author macbook
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        
        for(int i=0;i<10;i++)
        {
            UUID uuid = UUID.randomUUID();
            //System.out.println("Next "+(1+random.nextInt(10)));
            String uuidString = uuid.toString();
        
            System.out.println("UUID Object: " + uuid);
            System.out.println("UUID String: " + uuidString); 
        }
         
    }
}
