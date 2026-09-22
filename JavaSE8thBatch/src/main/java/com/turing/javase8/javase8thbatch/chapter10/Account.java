/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class Account {
    private int balance;
    
    public Account(int balance)
    {
        this.balance = balance;
    }
    public void debit(int amount)throws InvalidDebitOperation
    {
        if(this.balance >=amount && amount >=0)
        {
            this.balance -= amount;
        }
        else
        {
            throw new InvalidDebitOperation("Invalid amount or balance for debit "+amount);
        }
        
    }
    public void credit(int amount)throws InvalidCreditOperation
    {
        if(amount >=0 )
        {
            this.balance += amount;
        }
        else
        {
            throw new InvalidCreditOperation("Invalid amount for credit "+amount);
        }
        
    }

    public int getBalance() {
        return balance;
    }
}
