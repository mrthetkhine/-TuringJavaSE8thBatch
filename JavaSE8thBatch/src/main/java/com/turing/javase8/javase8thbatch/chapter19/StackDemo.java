/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter19;

import java.util.Stack;

/**
 *
 * @author macbook
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Peek "+stack.peek());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
    }
}
