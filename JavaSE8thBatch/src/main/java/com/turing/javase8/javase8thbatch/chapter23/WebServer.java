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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class HttpHandler extends Thread
{
    Socket client;
    HttpHandler(Socket client)
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
                String statusLine = in.readLine();
                System.out.println("Read done "+statusLine);
                String[] data = statusLine.split(" ");
                String url = data[1];
                
                System.out.println("Url "+url);
                
                if(url.equals("/") || url.equals(""))
                {
                    url = "index.html";
                }
                Path path = Path.of("./../WebRoot/"+url);
                System.out.println("isExist "+Files.exists(path));
               
                
                String body = "<h1>Hello from our server url "+url+"</h1>";
                
                if(Files.exists(path) )
                {
                     body = Files.readString(path);
                }
                String httpResponse = "HTTP/1.1 200 OK\r\n"
                        +"Content-Length: "+ body.length()+"\r\n"
                        +"Connection: Closed\r\n"
                        +"\r\n"
                        +body;
                        
                out.writeBytes(httpResponse);
                out.flush();
                out.close();
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
public class WebServer {
    public static void main(String[] args) {
        try {
            int port= 9000;
            ServerSocket socket = new ServerSocket(port);
            System.out.println("Started at "+port);
            while(true)
            {
                System.out.println("Listening ");
                Socket client = socket.accept();
                
                System.out.println("Get client "+client.getPort());
                
                HttpHandler handler = new HttpHandler(client);
                handler.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(WebServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
