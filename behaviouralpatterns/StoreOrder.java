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
public class StoreOrder extends OrderTemplate
    {
    @Override
    public void doCheckout()
        {
        System.out.println("Ring up items from cart");
        }

    @Override
    public void doPayment()
        {
        System.out.println("Process payment with card present");
        }

    @Override
    public void doReceipt()
        {
        System.out.println("Print receipt");
        }

    @Override
    public void doDelivery()
        {
        System.out.println("Bag items at counter");
        }
    
    }
