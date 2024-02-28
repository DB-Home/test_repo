/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.util.List;

/**
 *
 * @author dave
 */
public class AllLightsCommand implements Command
    {
    private List<Light> lights;
    
    public AllLightsCommand(List<Light> lights)
        {
        this.lights = lights;
        }
    
    @Override
    public void execute()
        {
        for(Light light: lights)
            {
            if(light.isOn())
                light.toggle();
            }
        }
    }
