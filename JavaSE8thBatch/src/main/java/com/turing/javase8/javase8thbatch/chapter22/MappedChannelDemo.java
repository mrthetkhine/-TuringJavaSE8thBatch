/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter22;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class MappedChannelDemo {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase8/javase8thbatch/chapter21/FileDemo.java");
        try(FileChannel fChan= (FileChannel) Files.newByteChannel(path))
        {
            long size = fChan.size();
            MappedByteBuffer buff = fChan.map(FileChannel.MapMode.READ_ONLY, 0, size);
            
            for (int i = 0; i < size; i++) {
                System.out.print((char)buff.get());
            }
            
        }
        catch(Exception e)
        {
        }
    }
}
