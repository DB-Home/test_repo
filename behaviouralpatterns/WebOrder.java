/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

/**
 *
 * @author dave
 */
public class WebOrder extends OrderTemplate
    {
    @Override
    public void doCheckout()
        {
        System.out.println("Get items from cart");
        System.out.println("Set gift prefs");
        System.out.println("Set delivery address");
        System.out.println("Set billing address");
        }

    @Override
    public void doPayment()
        {
        System.out.println("Process payment without card present");
        }

    @Override
    public void doReceipt()
        {
        System.out.println("Email receipt");
        }

    @Override
    public void doDelivery()
        {
        System.out.println("Ship item to delivery addess");
        }
    
    }
