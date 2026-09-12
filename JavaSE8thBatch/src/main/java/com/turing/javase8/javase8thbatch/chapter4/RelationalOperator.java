/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter4;

/**
 *
 * @author macbook
 */
class Data
{
    int value ;
}
public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        
        System.out.println("a==b "+(a == b));
        System.out.println("a== 10.0 "+(a == 10.0));
        //System.out.println("a==false "+(a==false));
        
        Data d1 = new Data();
        d1.value = 100;
        
        Data d2 = new Data();
        d2.value = 100;
        
        System.out.println("d1 "+d1);
        System.out.println("d2 "+d2);
        
        System.out.println("d1== d2 "+(d1==d2));
        Data d3 = d2;
        System.out.println("d3== d2 "+(d3==d2));
        
        float data = 0.0f/0;
        System.out.println("data== data "+(data==data));
        System.out.println("data != data "+(data!=data));
        System.out.println("isNaN  "+Float.isNaN(data));
        
        System.out.println("3 > 2 "+(3>2));
        //System.out.println("true > false "+(true>false));
        System.out.println("2>=2 "+(2>=2));
        System.out.println("2<=2 "+(2<=2));
        
        //System.out.println("Apple > orange "+("apple">"orange"));
        System.out.println("apple.localeCompare(orange) "+("c".compareTo("a")));
    }
}
