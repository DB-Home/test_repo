/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.util.List;
/**
 *
 * @author dave
 */
public class AtvPartsShippingVisitor implements AtvPartVisitor
    {
    double shippingAmount = 0.;
    @Override
    public void visit(Wheel wheel)
        {
        shippingAmount += 15;
        System.out.println("Wheels are bulky and expensive to ship");
        }

    @Override
    public void visit(Fender fender)
        {
        shippingAmount += 3;
        System.out.println("Fenders are light and cheap to ship");
        }

    @Override
    public void visit(Oil oil)
        {
        shippingAmount += 9;
        System.out.println("Oil is hazardous to ship");
        }

    @Override
    public void visit(PartsOrder order)
        {
        System.out.println("If they bought more than 3 things they get a discount on shipping");
        
        List<AtvPart> parts = order.getParts();
        if(parts.size() > 3)
            shippingAmount -= 5;
        
        System.out.println("Shipping is: " + shippingAmount);
        }
    
    }
