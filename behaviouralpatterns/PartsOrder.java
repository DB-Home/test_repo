/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dave
 */
public class PartsOrder implements AtvPart
    {
    private List<AtvPart> parts = new ArrayList<>();
    
    public PartsOrder()
        {
        
        }
    
    public void addPart(AtvPart atvPart)
        {
        parts.add(atvPart);
        }
    
    public List<AtvPart> getParts()
        {
        return Collections.unmodifiableList(parts);
        }
    
    @Override
    public void accept(AtvPartVisitor visitor)
        {
        for(AtvPart atvPart: parts)
            atvPart.accept(visitor);
        visitor.visit(this);
        }
    
    /*
    Org version
    @Override
    public double calculateShipping()
        {
        double shippingCost = 0.;
        for(AtvPart atvPart: parts)
            shippingCost += atvPart.calculateShipping();
        
        return shippingCost;
        }
    */
    }
