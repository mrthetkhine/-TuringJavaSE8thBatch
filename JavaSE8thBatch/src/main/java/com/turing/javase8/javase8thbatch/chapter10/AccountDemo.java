/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class AccountDemo {
    public static void main(String[] args) {
        Account acc = new Account(100);
        System.out.println("Before Balance "+acc.getBalance());
        
        try {
            acc.credit(200);
            acc.debit(-400);
            
        } catch (InvalidCreditOperation|InvalidDebitOperation ex) {
            System.out.println("Excep "+ex.getMessage());
        }
        
        
        
       
        System.out.println("Balance "+acc.getBalance());
    }
}
