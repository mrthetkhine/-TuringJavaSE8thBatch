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
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase8/javase8thbatch/chapter21/FileDemo.java");
        
        System.out.println("Name "+file.getName());
        System.out.println("path "+file.getPath());
        System.out.println("getAbsolutePath "+file.getAbsolutePath());
        System.out.println("Parent "+file.getParent());
        System.out.println("isDirectory "+file.isDirectory());
        System.out.println("isFile "+file.isFile());
        System.out.println("Length "+file.length());
        System.out.println("Hidden "+file.isHidden());
    }
}
