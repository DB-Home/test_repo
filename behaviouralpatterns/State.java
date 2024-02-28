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
public abstract class State
    {
    public void handleRequest()
        {
        System.out.println("ERROR: sholdn't be able to get here");
        }
    }
