/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author macbook
 */
public class LocaleDemo {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Locale "+locale);
        System.out.println("Display Name "+locale.getDisplayName());
        System.out.println("Country "+locale.getDisplayCountry());
        
        Currency c = Currency.getInstance(locale);
        System.out.println("C "+c.getCurrencyCode());
        System.out.println("getDefaultFractionDigits "+c.getDefaultFractionDigits());
    }
}
