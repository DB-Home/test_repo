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
public class VisaStrategy extends ValidationStragey
    {
    @Override
    public boolean isValid(CreditCard creditCard)
        {
        boolean isValid = true;
        
        isValid = creditCard.getNumber().startsWith("");
        
        if(isValid)
            isValid = creditCard.getNumber().length() == 16;
        
        if(isValid)
            isValid = passedLuhn(creditCard.getNumber());
        
        return isValid;
        }
    }
