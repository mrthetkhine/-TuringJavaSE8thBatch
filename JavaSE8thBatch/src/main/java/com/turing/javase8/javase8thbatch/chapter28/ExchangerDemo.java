/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.concurrent.Exchanger;

/**
 *
 * @author macbook
 */
class Maker extends Thread
{
    Exchanger<String> exchanger;
    String str;
    
    Maker(Exchanger<String> exchanger)
    {
        this.exchanger = exchanger;
        this.str = new String();
    }
    public void run()
    {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 5; j++) {
                str+= ch++;
            }
            try
            {
                System.out.println("Maker send "+str);
                str = this.exchanger.exchange(str);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class UseString extends Thread
{
    Exchanger<String> exchanger;
    String str;
    
    UseString(Exchanger<String> exchanger)
    {
        this.exchanger = exchanger;
        this.str = new String();
    }
    public void run()
    {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            
            
            try
            {
                str = this.exchanger.exchange(new String());
                System.out.println("UseString got "+str);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        Maker maker = new Maker(exchanger);
        UseString useString = new UseString(exchanger);
        
        maker.start();
        useString.start();
    }
}
