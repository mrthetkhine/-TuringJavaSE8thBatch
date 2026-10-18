/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author macbook
 */
class MyTask extends TimerTask
{

    @Override
    public void run() {
        Date date = new Date();
        System.out.println("MyTask executed "+date);
    }
}
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer =new Timer();
        MyTask task = new MyTask();
        
        timer.schedule(task, 1000, 3000);
        System.out.println("Start");
    }
}
