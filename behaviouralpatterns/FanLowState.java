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
public class FanLowState extends State
    {
    private Fan fan;
    
    public FanLowState(Fan fan)
        {
        this.fan = fan;
        }
    
    @Override
    public void handleRequest()
        {
        System.out.println("Turning fan on to med state.");
        fan.setState(fan.getFanMedState());
        }
    
    public String toString()
        {
        return "Fan is low.";
        }
    }
