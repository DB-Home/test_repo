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
public class AmexStrategy extends ValidationStragey
    {
    @Override
    public boolean isValid(CreditCard creditCard)
        {
        boolean isValid = true;
        
        isValid = creditCard.getNumber().startsWith("37") || creditCard.getNumber().startsWith("34");
        
        if(isValid)
            isValid = creditCard.getNumber().length() == 15;
        
        if(isValid)
            isValid = passedLuhn(creditCard.getNumber());
        
        return isValid;
        }
    
    }
