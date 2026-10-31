/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class DataInputStreamDemo {

    public static void main(String[] args) {
        File file = new File("./temp.data");

        try ( DataInputStream fIn = new DataInputStream(new FileInputStream(file));) {
            String str = fIn.readUTF();
            System.out.println("Str " + str);

            double data = fIn.readDouble();
            System.out.println("Data " + data);
            int a = fIn.readInt();

            System.out.println("Int " + a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
