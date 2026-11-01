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
public class UdpServer {
    public static void main(String[] args) {
        int port = 8000;
        try {
            DatagramSocket socket = new DatagramSocket(port);
            byte buffer[] = new byte[1024];
            System.out.println("UDP listen on "+port);
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
            while(true)
            {
                socket.receive(packet);
                System.out.println("Packet data reveived "+ new String(packet.getData()));
                System.out.println("Packet port "+packet.getPort());
               
                String response = "Response from server"+(new Date()) +"\r\n";
                byte[] responseBuffer = response.getBytes();
                DatagramPacket packetResponse = new DatagramPacket(responseBuffer,responseBuffer.length);

                packetResponse.setAddress(InetAddress.getLocalHost());
                packetResponse.setPort(packet.getPort());

                socket.send(packetResponse);
            }
        } catch (SocketException ex) {
            Logger.getLogger(UdpServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UdpServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
