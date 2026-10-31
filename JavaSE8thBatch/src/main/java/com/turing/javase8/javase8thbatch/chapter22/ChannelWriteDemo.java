/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter22;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author macbook
 */
public class ChannelWriteDemo {
    public static void main(String[] args) {
        Path path = Path.of("./hello.txt");
        int count;
        try(FileChannel fChan=(FileChannel) Files.newByteChannel(path,StandardOpenOption.CREATE,StandardOpenOption.WRITE))
        {
            ByteBuffer buffer = ByteBuffer.allocate(26);
           
            char ch = 'a';
            for (int i = 0; i < 26; i++) {
                buffer.put((byte)ch++);
            }
            buffer.rewind();
            fChan.write(buffer);
        }
        catch(Exception e)
        {
        }
    }
}
