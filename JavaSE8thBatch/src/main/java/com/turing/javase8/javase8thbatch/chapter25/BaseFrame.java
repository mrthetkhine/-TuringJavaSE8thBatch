/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter25;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author macbook
 */
public abstract class BaseFrame extends JFrame {
    BaseFrame(String title)
    {
        super(title);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
        this.addWindowListener(new WindowAdapter(){
            

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            
        });
        this.setLayout(new FlowLayout());
        this.init();
    }
    abstract void init();
}
