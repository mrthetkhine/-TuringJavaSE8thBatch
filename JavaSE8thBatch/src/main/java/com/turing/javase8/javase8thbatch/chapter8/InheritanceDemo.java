/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Window95
{
    void start()
    {
        System.out.println("Start");
    }
    void shutdown()
    {
        System.out.println("Shutdown");
    }
}
class Window2000 extends Window95
{
    void screenSaver()
    {
        System.out.println("ScreenSaver");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Window2000 win = new Window2000();
        
        win.start();
        win.screenSaver();
        win.shutdown();
    }
}
