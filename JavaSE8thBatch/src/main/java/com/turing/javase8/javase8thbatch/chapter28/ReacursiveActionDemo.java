/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.concurrent.ForkJoinPool;
import static java.util.concurrent.ForkJoinTask.invokeAll;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author macbook
 */
class SqrtTransform extends RecursiveAction
{
    final int seqThreshold = 25;
    double []data;
    
    int start,end;
    
    public SqrtTransform(double[]data,int start,int end)
    {
        this.data = data;
        this.start = start;
        this.end = end;
        
        System.out.println("Start "+start+" end "+end);
    }

    @Override
    protected void compute() {
        if( (end-start)<=this.seqThreshold)
        {
            for (int i = this.start; i < this.end; i++) {
                this.data[i] = Math.sqrt(this.data[i]);
            }
        }
        else
        {
            int middle= (start+end)/2;
            invokeAll(new SqrtTransform(data,start,middle), 
                    new SqrtTransform(data,middle,end));
        }
    }
    
}
public class ReacursiveActionDemo {
    public static void main(String[] args) {
        ForkJoinPool fp = new ForkJoinPool();
        double data[] = new double[100];
        
        for (int i = 0; i < data.length; i++) {
            data[i]=i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Data "+i+" "+ data[i]);
                    
        }
        SqrtTransform sq = new SqrtTransform(data,0,data.length);
        fp.invoke(sq);
        for (int i = 0; i < 10; i++) {
            System.out.println("Data "+i+" "+ data[i]);
                    
        }
        
    }
}
