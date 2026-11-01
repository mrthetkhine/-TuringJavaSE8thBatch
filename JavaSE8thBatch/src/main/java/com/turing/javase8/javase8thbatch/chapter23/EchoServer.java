/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class EchoHandler extends Thread
{
    Socket client;
    EchoHandler(Socket client)
    {
        this.client = client;
    }
    public void run()
    {
        try
        {
            try(DataOutputStream out = new DataOutputStream(client.getOutputStream());
                    DataInputStream in=new DataInputStream(client.getInputStream()))
            {
                String message = in.readLine();
                System.out.println("Read done "+message);
                out.writeBytes((message.toUpperCase() + new Date()+"\r\n"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
                client.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}
public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(9000);
            
            while(true)
            {
                System.out.println("Listening ");
                Socket client = socket.accept();
                
                System.out.println("Get client "+client.getPort());
                
                EchoHandler handler = new EchoHandler(client);
                handler.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(EchoServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
