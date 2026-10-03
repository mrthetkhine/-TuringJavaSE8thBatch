/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author macbook
 */
class Sum extends RecursiveTask<Double>
{
    final int seqThreshold = 25;
    double []data;
    
    int start,end;

    Sum(double[]data,int start,int end)
    {
        this.data = data;
        this.start = start;
        this.end = end;
        
        System.out.println("Start "+start+" end "+end);
    }
    @Override
    protected Double compute() {
        double total =0;
        if( (end-start)<=this.seqThreshold)
        {
            
            for (int i = this.start; i < this.end; i++) {
                total+=this.data[i];
            }
        }
        else
        {
            int middle= (start+end)/2;
            Sum s1 = new Sum(data,start,middle);
            Sum s2 = new Sum(data,middle,end);
            
            s1.fork();
            s2.fork();
            
            total = s1.join()+ s2.join();
            
        }
        return total;
    }
    
    
}
public class RecursiveTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fp = new ForkJoinPool();
        double data[] = new double[100];
        
        for (int i = 0; i < data.length; i++) {
            data[i]=i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Data "+i+" "+ data[i]);
                    
        }
        Sum sq = new Sum(data,0,data.length);
        Double total = fp.invoke(sq);
        System.out.println("Total "+total);
        
    }
}
