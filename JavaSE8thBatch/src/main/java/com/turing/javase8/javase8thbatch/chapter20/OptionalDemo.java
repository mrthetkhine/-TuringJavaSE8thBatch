/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter20;

import java.util.Optional;
import java.util.OptionalInt;

/**
 *
 * @author macbook
 */
public class OptionalDemo {
    
    static Optional<Integer> getData(int n)
    {
        if(n==0)
        {
            return Optional.empty();
        }
        else
        {
            return Optional.of(n);
        }
    }
    public static void main(String[] args) {
        Integer data = 10;
        Optional.ofNullable(data)
                            .map(x->{
                                System.out.println("Inc");
                                return x+1;
                            })
                            .flatMap(OptionalDemo::getData)
                            .ifPresent(x->{
                                  System.out.println("Get "+x);
                             });

        getData(10) 
              .map(x->{
                  System.out.println("Add 20");
                  return x+20;
              })  
              .ifPresentOrElse(x->System.out.println("Present "+x), 
                               ()-> System.out.println("Nothing"));
              //.orElse(100);
        //System.out.println("Result "+result);      
        
                                    
    }
}
