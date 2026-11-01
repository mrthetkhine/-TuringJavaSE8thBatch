/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter23;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class HttpRequestDemo {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder(new URI("http://www.google.com"))
                    .build();
            HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
            HttpHeaders headers = resp.headers();
            
            for(var header: headers.map().entrySet())
            {
                System.out.println("Header "+header);
            }
            System.out.println("Resp "+resp.body());
        } catch (Exception ex) {
            Logger.getLogger(HttpRequestDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
