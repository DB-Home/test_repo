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
public abstract class Handler
    {
    protected Handler sucessor;
    
    public void setSuccessor(Handler successor)
        {
        this.sucessor = successor;
        }
    
    public abstract void handleRequest(Request request);
    }
