/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter8;

/**
 *
 * @author macbook
 */
/*
class BadDesignEcommerce
{
    Gateway gateway;
    KBZGateway kbZGateway;
    CBGateway cbGateway;
    
    public Ecommerce(Gateway gateway)
    {
        this.gateway = gateway;
    }
    public Ecommerce(KBZGateway gateway)
    {
        this.gateway = gateway;
    }
    void processOrder()
    {
        System.out.println("Process order");
        if(kbzGateway !=null)
        {
            this.kbzGateway.payment();
        }
        else if(cbGateway !=null)
        {
            this.cbGateway.payment();
        }
        
    }
            
}
*/
abstract class Gateway
{
    void init()
    {
        System.out.println("Gateway init");
    }
    abstract void payment();
   
}
class KBZGateway extends Gateway
{
    void payment()
    {
        super.init();
        System.out.println("KBZGateway payment process");
    }
}
class CBGateway extends Gateway
{
    void payment()
    {
        System.out.println("CB payment process");
    }
}

class Ecommerce
{
    Gateway gateway;
    
    public Ecommerce(Gateway gateway)
    {
        this.gateway = gateway;
    }
    void processOrder()
    {
        System.out.println("Process order");
        this.gateway.payment();
    }
            
}
public class PaymentDemo {
    public static void main(String[] args) {
        Gateway gateway = new KBZGateway();
        //gateway = new Gateway();
        Ecommerce ecommerce = new Ecommerce(gateway);
        ecommerce.processOrder();
    }
}
