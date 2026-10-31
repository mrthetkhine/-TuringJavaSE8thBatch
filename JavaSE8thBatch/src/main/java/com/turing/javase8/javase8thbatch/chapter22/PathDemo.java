/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter22;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class PathDemo {
    public static void main(String[] args) {
        Path source = Path.of("./hello.txt");
        Path target = Path.of("./hello2.txt");
        
        try {
            System.out.println("fileExist "+Files.exists(source));
            System.out.println("Executable "+Files.isExecutable(source));
            System.out.println("Readable "+Files.isReadable(source));
            System.out.println("Writable "+Files.isWritable(target));
            //Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception ex) {
            Logger.getLogger(PathDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
