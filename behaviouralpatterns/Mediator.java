/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author dave
 */
public class Mediator
    {
    private List<Light> lights = new ArrayList<>();
    
    public void registerLight(Light light)
        {
        lights.add(light);
        }
    
    public void turnOnAllLights()
        {
        for(Light light: lights)
            {
            if(!light.isOn())
                light.toggle();
            }
        }
    
    public void turnOffAllLights()
        {
        for(Light light: lights)
            {
            if(light.isOn())
                light.toggle();
            }
        }
    }
