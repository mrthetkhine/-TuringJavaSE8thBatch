/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Sum implements Callable<Integer>
{
    int stop ;
    public Sum(int stop)
    {
        this.stop = stop;
    }
    @Override
    public Integer call() throws Exception {
        int total = 0;
        try
        {
            //Thread.sleep(9);
        }
        catch(Exception e)
        {
        }
        for (int i = 1; i <= stop; i++) {
            total += i;
        }
        System.out.println("Stop "+stop +" done ");
        return total;
    }
}
public class CallableFutureDemo {
    public static void main(String[] args) {
        ExecutorService exs;
        exs = Executors.newFixedThreadPool(2);
        
        Sum s1= new Sum(100);
        Sum s2 = new Sum(50);
        
        Future<Integer> result1 = exs.submit(s1);
        Future<Integer> result2 = exs.submit(s2);
        
        try
        {
            
            int t1 = result1.get(10,TimeUnit.MILLISECONDS);
            int t2 = result2.get();
            System.out.println("Result 1 "+t1);
            System.out.println("Result 2 "+t2);
            
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
             exs.shutdown();
        }
    }
}
