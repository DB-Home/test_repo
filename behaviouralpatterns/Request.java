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
public class Request
    {
    private RequestType requestType;
    private double amount;
    
    public Request(RequestType requestType, double amount)
        {
        this.requestType = requestType;
        this.amount = amount;
        }
    
    public RequestType getRequestType()
        {
        return requestType;
        }
    
    public double getAmount()
        {
        return amount;
        }
    }
