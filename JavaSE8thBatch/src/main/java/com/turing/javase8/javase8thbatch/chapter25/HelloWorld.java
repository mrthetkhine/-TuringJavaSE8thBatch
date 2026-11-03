/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter25;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author macbook
 */
class HelloWorldFrame extends Frame
{
    public HelloWorldFrame()
    {
        super("HelloWorld frame");
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
        this.addWindowListener(new WindowAdapter(){
            

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            
        });
    }
    void drawPoint(Graphics g,int x,int y)
    {
        g.drawArc(x, y, 1, 1, 0, 360);
    }
    void drawCircle(Graphics g,int x,int y,int radius)
    {
        for (int i = 0; i < 360; i++) {
            int delta = (int)(3.1-Math.cos(i*Math.PI));
            int xco = (int)(x + radius * delta * Math.cos(i));
            int yco = (int)(y + radius * delta * Math.sin(i));
            this.drawPoint(g, xco, yco);
        }
    }
    public void paint(Graphics g)
    {
        System.out.println("Paint");
        g.drawLine(10, 10, 300, 300);
        drawPoint(g,200,200);
        drawCircle(g,400,400,100);
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        HelloWorldFrame frame = new HelloWorldFrame();
        frame.setVisible(true);
    }
}
