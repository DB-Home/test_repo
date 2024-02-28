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
public class Fender implements AtvPart
    {
    @Override
    public void accept(AtvPartVisitor visitor)
        {
        visitor.visit(this);
        }
    }

/*
Org version
public class Fender implements AtvPart
    {
    @Override
    public double calculateShipping()
        {
        return 3;
        }
    
    }
*/