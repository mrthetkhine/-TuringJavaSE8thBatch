/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",9000);
            
            try(DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in=new DataInputStream(socket.getInputStream()))
            {
                String httpRequest = "Hello"
                                    +"\r\n";
                out.write(httpRequest.getBytes());
                out.flush();
                
                int data ;
                while( (data=in.read()) !=-1)
                {
                    System.out.print((char)data);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        } catch (IOException ex) {
            Logger.getLogger(EchoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
