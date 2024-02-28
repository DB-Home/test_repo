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
//receiver
//Used in the command and mediator examples.
public class Light
    {
    private boolean isOn = false;
    private String name = null;
    
    public Light(){}
    
    public Light(String name)
        {
        this.name = name;
        }
    
    public boolean isOn()
        {
        return isOn;
        }
    
    public void toggle()
        {
        if(isOn)
            {
            off();
            isOn = false;
            }
        else
            {
            on();
            isOn = true;
            }
        }
    
    public void on()
        {
        if(name == null)
            System.out.println("Light switched on.");
        else
            System.out.println(name + " light switched on.");
        }
    
    public void off()
        {
        if(name == null)
            System.out.println("Light switched off.");
        else
            System.out.println(name + " light switched off.");
        }
    }
