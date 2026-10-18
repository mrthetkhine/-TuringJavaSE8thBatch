/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;


/**
 *
 * @author macbook
 */
public class DateDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate after = now.plus(3, ChronoUnit.WEEKS);
        
        System.out.println("Now "+now);
        System.out.println("After "+after);
        
        System.out.println("Day "+now.getDayOfMonth());
        System.out.println("DayOfWeek "+now.getDayOfWeek());
        System.out.println("Month "+now.getMonthValue());
        System.out.println("Year "+now.getYear());
        
        LocalDateTime time = LocalDateTime.now() ;
        System.out.println("Time "+time);
        
        System.out.println("Before "+now.isBefore(after));
    }
}
