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
public class FanMedState extends State
    {
    private Fan fan;
    
    public FanMedState(Fan fan)
        {
        this.fan = fan;
        }
    
    @Override
    public void handleRequest()
        {
        System.out.println("Turning fan on to high state.");
        fan.setState(fan.getFanHighState());
        }
    
    public String toString()
        {
        return "Fan is med.";
        }
    }
