/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter23;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class IpAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
            for(var addr : addresses)
            {
                System.out.println("Addr "+addr);
            }
             System.out.println("Localhost "+InetAddress.getLocalHost());
        } catch (UnknownHostException ex) {
            Logger.getLogger(IpAddressDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
