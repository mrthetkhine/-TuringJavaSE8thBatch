/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author macbook
 */
class Item
{
    String name;
    float price;
    int qty;
    
    public Item(String name,float price,int qty)
    {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
}
public class FormatterDemo {
    public static void main(String[] args) {
        
        Formatter fmt = new Formatter();
        List<Item> list = new ArrayList<>();
        list.add(new Item("Long name",12.345F,20));
        list.add(new Item("Apple",10,2));
        list.add(new Item("Banana",30.1F,10));
        
        for(Item item : list)
        {
            fmt.format("%-40s %12.2f %5d %n", item.name,item.price,item.qty);
            
        }
        System.out.println(fmt);
        fmt.close();
    }
}
