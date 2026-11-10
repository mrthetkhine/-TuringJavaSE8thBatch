/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter30;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author macbook
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.UK);
        System.out.println("df.format "+df.format(date));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        System.out.println("sdf "+sdf.format(date));
        
        sdf = new SimpleDateFormat("dd/MM/yyyy E");
        System.out.println("sdf "+sdf.format(date));
        
        LocalDate lDate = LocalDate.now();
        System.out.println("lDate "+lDate );
        
        LocalTime time = LocalTime.now();
        System.out.println("Time "+time);
        
        String input = "10/11/2026";
        LocalDate currentDateTime = LocalDate.parse(input,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("CurrentDate "+currentDateTime);
    }
}
