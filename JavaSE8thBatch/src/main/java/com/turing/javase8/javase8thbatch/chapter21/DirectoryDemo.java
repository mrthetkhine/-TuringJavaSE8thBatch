/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.File;

/**
 *
 * @author macbook
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase8/javase8thbatch/chapter20");
        System.out.println("isDirectory "+file.isDirectory());
        File[] files = file.listFiles();
        for(File f: files)
        {
            System.out.println(f.getPath());
        }
    }
}
