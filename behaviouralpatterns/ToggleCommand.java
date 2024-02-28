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
public class ToggleCommand implements Command
    {
    private Light light;
    
    public ToggleCommand(Light light)
        {
        this.light = light;
        }
    
    @Override
    public void execute()
        {
        light.toggle();
        }
    }
