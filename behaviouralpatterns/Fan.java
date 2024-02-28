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
public class Fan
    {
    State fanOffState;
    State fanLowState;
    State fanMedState;
    State fanHighState;
    
    State state;
    
    public Fan()
        {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);
        
        state = fanOffState;
        }
    
    public void pullchain()
        {
        state.handleRequest();
        }
    
    public String toString()
        {
        return state.toString();
        }
    
    public void setState(State state)
        {
        this.state = state;
        }
    
    public State getFanOffState()
        {
        return fanOffState;
        }
    
    public State getFanLowState()
        {
        return fanLowState;
        }
    
    public State getFanMedState()
        {
        return fanMedState;
        }
    
    public State getFanHighState()
        {
        return fanHighState;
        }
    }
