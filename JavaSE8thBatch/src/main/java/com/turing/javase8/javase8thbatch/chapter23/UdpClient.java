/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter23;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class UdpClient {
    public static void main(String[] args) {
        
        try {
            DatagramSocket socket = new DatagramSocket();
            System.out.println("Socket port "+socket.getPort());
            byte buffer[] = new byte[1024];
           
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length,InetAddress.getLocalHost(), 8000);
            packet.setData( "Hello World".getBytes());
            
            socket.send(packet);
            System.out.println("Data sended");
            
            buffer = new byte[1024];
            DatagramPacket receivedPacket = new DatagramPacket(buffer,buffer.length);
            socket.receive(receivedPacket);
            
            System.out.println("Client got from server"+ (new String(receivedPacket.getData(),0,receivedPacket.getLength())));
        } catch (SocketException ex) {
            Logger.getLogger(UdpServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UdpServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
