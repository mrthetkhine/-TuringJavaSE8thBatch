/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter21;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author macbook
 */
class OnlyExt implements FilenameFilter
{
    String ext;
    public OnlyExt(String ext)
    {
        this.ext = "."+ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(this.ext);
    }
}
public class FileNameFilterDemo {
    public static void main(String[] args) {
        File file = new File("./../");
        System.out.println("File "+file.getAbsolutePath());
        OnlyExt ext = new OnlyExt("html");
        
        File[] files = file.listFiles(ext);
        for(File f: files)
        {
            System.out.println(f.getPath());
        }
        File temp = new File("./../temp");
        temp.mkdir();
    }
}
