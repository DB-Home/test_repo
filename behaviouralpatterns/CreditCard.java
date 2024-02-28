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
public class CreditCard
    {
    private String number;
    private String date;
    private String cvv;
    private ValidationStragey strategy;
    
    public CreditCard(ValidationStragey strategy)
        {
        this.strategy = strategy;
        }
    
    public boolean isValid()
        {
        return strategy.isValid(this);
        }

    public String getNumber()
        {
        return number;
        }

    public void setNumber(String number)
        {
        this.number = number;
        }

    public String getDate()
        {
        return date;
        }

    public void setDate(String date)
        {
        this.date = date;
        }

    public String getCvv()
        {
        return cvv;
        }

    public void setCvv(String cvv)
        {
        this.cvv = cvv;
        }
    }
