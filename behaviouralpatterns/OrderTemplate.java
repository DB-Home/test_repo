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
public abstract class OrderTemplate
    {
    public boolean isGift;
    
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    public abstract void doDelivery();
    
    public final void wrapGift()
        {
        System.out.println("Gift was wrapped");
        }
    
    public final void processOrder()
        {
        doCheckout();
        doPayment();
        if(isGift)
            wrapGift();
        else
            doReceipt();
        
        doDelivery();
        }
    
    }
