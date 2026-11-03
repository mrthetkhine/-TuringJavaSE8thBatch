/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter25;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author macbook
 */
public class ControlDemo extends BaseFrame implements ActionListener{

    ControlDemo()
    {
        super("Control demo");
    }
    
    @Override
    void init() {
        System.out.println("Init");
        
        JLabel lblOne = new JLabel("One");
        this.add(lblOne);
        
        JLabel lblTwo = new JLabel("Two");
        this.add(lblTwo);
        
        JButton btnOk = new JButton("Ok");
        
        /*
        btnOk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ok button clicked");
            }
        });
        */
        btnOk.addActionListener(ae->{
            System.out.println("Ok button clicked "+ae.getActionCommand());
        });
        
        
        
        this.add(btnOk);
        
        JButton btnTwo =new JButton("Two");
        JButton btnThree = new JButton("Three");
        
        this.add(btnTwo);
        this.add(btnThree);
        
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        
        JCheckBox chkAgree = new JCheckBox();
        this.add(chkAgree);
        
        chkAgree.addActionListener(ae->{
            System.out.println("Check clicked "+chkAgree.isSelected());
        });
        
        CheckboxGroup cbGroup = new CheckboxGroup();
        Checkbox chkMale = new Checkbox("Male",cbGroup,true);
        Checkbox chkFemale = new Checkbox("Female",cbGroup,false);
        
        add(chkMale);
        add(chkFemale);
        
    }
    public static void main(String[] args) {
        ControlDemo demo = new ControlDemo();
        demo.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Button cliked "+ae.getActionCommand());
    }
}
